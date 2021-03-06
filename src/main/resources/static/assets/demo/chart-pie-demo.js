// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Pie Chart Example
var bestCategory = $("#bestCategory").val();
bestCategory = bestCategory.replace(/[\[\]']+/g,'').split(",");

var percent = $("#percent").val();
percent = percent.replace(/[\[\]']+/g,'').split(",");

var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'pie',
  data: {
    labels: bestCategory,
    datasets: [{
      data: percent,
      backgroundColor: ['#007bff', '#dc3545', '#ffc107', '#28a745'],
    }],
  },
});
