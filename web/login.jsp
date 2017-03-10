<div style=" float: right;">
  <div style="color: red">
    <c:if test="${not empty error}">
      ${error}
    </c:if>
  </div>
  <form action="/Login" method="post">
    <table>
      <tr>
        <td>email:</td>
        <td><input type="text" name="email"/></td>
      </tr>
      <tr>
        <td>password: </td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td><button>Login</button></td>
        <td><a href="#">Registration</a></td>
      </tr>
    </table>
  </form>
</div>
