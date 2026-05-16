# GitHub 사용법
---
**git init**

**git remote -v** 
: 현재 로컬에 저장된 원격저장소 LIST (원격저장소이름 주소)
**git remote add [원격저장소이름] [주소]**
(예시: git remote add step4 https://github.com/DJ-BE-7/exercise-simple-http-server-step4.git)


**git add .** : 현재까지 한 내용 저장
**git commit -m [commit메시지]** : 저장된 내용으로 로컬 저장소에 commit
(예시:  git commit -m "step4 과제 제출")

**git branch** : 현재 로컬에 branch들 
**git branch [새로 만들 branch]** : branch 생성
(예시: git branch step4)
**git checkout [branch 이름]** : branch 이동
(예시: git checkout step4)

**git push [원격저장소이름] [로컬브랜치이름]:[올릴원격저장소의 브랜치이름]**
(예시: git push step4 step4:feature/JBDJ07-046)
로컬브랜치는 존재하는걸로 해야되고 원격저장소 브랜치는 없으면 자동으로 생성 후 push해줌


** git remote 주소 변경 방법
**git remote set-url [원격저장소이름] [새로 변경할 주소]**
