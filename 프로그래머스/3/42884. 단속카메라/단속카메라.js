function solution(routes) {
    let cnt = 1;
    const o_routes = routes.sort((a,b) => a[1] - b[1]);
    
    // const t_routes = o_routes.sort(x => x[0]);
        
    let current_camara = o_routes[0][1]
    for(let i = 1; i < routes.length; i++){
        if(o_routes[i][0] <= current_camara){
            // current_camara = o_routes[i][1];
        }
        else{
            cnt++;
            current_camara = o_routes[i][1];
        }
    }
    return cnt;
}