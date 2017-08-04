<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>방명록</title>
</head>
<body>
	<div id="container">

		<div id="wrapper">
			<div id="content">
				<div id="guestbook">

					<form method="post" action="/gb/delete">
						<input type="hidden" name="no" value="${requestScope.no}">
						<table>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" name="password"></td>
								<td><input type="submit" value="확인"></td>
								<td><a href="list.jsp"></a>메인으로돌아가기</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>