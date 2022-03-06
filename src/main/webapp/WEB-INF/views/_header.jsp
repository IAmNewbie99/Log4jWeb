<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<div class="navbar-nav">
   <a class="nav-item nav-link" href="/">Home</a>
   <a class="nav-item nav-link" href="/collection">Collection</a>
   <a class="nav-item nav-link" href="/shoes">Shoes</a>
   <a class="nav-item nav-link" href="/racingboots">Racing Boots</a>
   <a class="nav-item nav-link" href="/contact">Contact</a>
   <a class="nav-item nav-link last" href="#"><img src="images/search_icon.png"></a>
   <form class="form-inline" method="get" action="search">
   <input type="text" name="name" class="form-control" placeholder="Search...">
   <button type="submit" class="btn btn-primary">Search</button>
   </form>
</div>