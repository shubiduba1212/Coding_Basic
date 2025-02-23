def solution(genres, plays):
    answer = []
    temp = {}
    
    for i in range(len(genres)) :
        temp[genres[i]] = temp.get(genres[i], {})
        temp[genres[i]]["total"] = temp[genres[i]].get("total", 0) + plays[i]
        temp[genres[i]]["list"] = temp[genres[i]].get("list", {})
        temp[genres[i]]["list"][i] = plays[i]
            
    # print(temp)
    sorted_list = sorted(temp.items(), key=lambda item: item[1]["total"], reverse= True)
    for i in sorted_list :
        sorted_plays = sorted(i[1]["list"].items(), key=lambda item:item[1], reverse=True)
        answer.append(sorted_plays[0][0])
        if len(sorted_plays) > 1 :            
            answer.append(sorted_plays[1][0])
    
    return answer