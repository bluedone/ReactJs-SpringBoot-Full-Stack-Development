import axios from "axios";

const INSTRUCTOR = "alanbinu";
const PASSWORD = "dummy";
const COURSE_API_URL = "http://localhost:8080";
const INSTRUCTOR_API_URL = `${COURSE_API_URL}/instructors/${INSTRUCTOR}`;

class CourseDataService {
  retrieveAllCourses(name) {
    return axios.get(`${INSTRUCTOR_API_URL}/courses`, {
      headers: {
        authorization: "Basic " + window.btoa(INSTRUCTOR + ":" + PASSWORD),
      },
    });
  }
}

export default new CourseDataService();
