function solution(genres, plays) {
    const genreMap = new Map();

    // 장르별로 총 재생 수와 상위 2곡만 저장
    genres.map((genre, index) => [genre, plays[index], index])
        .forEach(([genre, play, index]) => {
            const data = genreMap.get(genre) || { total: 0, songs: [] };

            genreMap.set(genre, {
                total: data.total + play,
                songs: [...data.songs, { play, index }]
                    .sort((a, b) => b.play - a.play) // play 기준 정렬
                    .slice(0, 2) // 상위 2곡 유지
            });
        });

    // 총 재생 수가 높은 장르 순서대로 정렬하고, 각 장르별 상위 2곡의 index 반환
    return [...genreMap.entries()]
        .sort((a, b) => b[1].total - a[1].total)
        .flatMap(item => item[1].songs.map(song => song.index));
}
