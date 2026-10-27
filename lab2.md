# 💻 Lab #2: Peer Reviewed Coding Assessment

**Course:** CSC 233
**Lab Goal:** To develop critical debugging, code analysis, and professional feedback skills by evaluating the structure, efficiency, and functionality of peer-written code.
**Weight:** 30% of overall attendance/participation grade & one assignment.
**Due Date:** October 29th at 9:25 A.M.

***

## 🎯 Objectives (What You Will Learn)

Upon completion of this lab, you will be able to:
*   **Identify logical flaws:** Spot bugs or assumptions in code that prevent the program from running as expected.
*   **Analyze architecture:** Determine if the code's structure is sound, modular, and easily maintainable.
*   **Propose optimizations:** Suggest specific, measurable improvements to increase the performance or efficiency of the codebase.
*   **Communicate professionally:** Articulate critical feedback clearly, constructively, and respectfully, adopting the language of a professional GUI Programmer.

## 🛠️ Materials & Preparation

*   **The Codebase:** The source code from one group member (verified by the professor). 
*   **Tools:** Access to a compiler/interpreter and a text editor.
*   **Collaboration:** Working in a peer review setting. Preferably, in the Gallagher Laboratory.

## 🚀 Lab Procedure: The Three Phases of Review

Your review must systematically address the codebase through three distinct phases:

### 🟢 Phase 1: Functional Analysis (The "Does it work?" Test)
1.  **Testing:** Run the code with various inputs, paying special attention to **edge cases** (e.g., empty or excessive inputs, zero values, max limits, negative numbers).
2.  **Goal:** Determine if the code produces the correct output for all intended use scenarios.
3.  **Deliverable:** Identify any bugs, runtime errors, or cases where the output does not match the expected behavior. Then, apply fixes to those issues (e.g., GitHub pull requests, collaborative programming environments).

### 🟡 Phase 2: Code Comprehension (The "How is it built?" Review)
1.  **Reading:** Examine the function signatures, variable naming, and overall file structure.
2.  **Goal:** Assess the maintainability and readability of the code.
3.  **Questions to Ask:** Is the code confusing? Is the responsibility of each function clear? Could a new developer understand this code quickly?
4.  **Deliverable:** Identify areas that are poorly modularized, unnecessarily complex, or confusingly named. 

### 🔴 Phase 3: Efficiency & Best Practices (The "How can it be better?" Audit)
1.  **Analysis:** Look for performance bottlenecks. Is the code using inefficient loops or data structures?
2.  **Goal:** Suggest concrete ways to improve the code's performance and adherence to best practices and implement them.
3.  **Questions to Ask:** Can this calculation be done faster? Is there redundant code that could be removed? Does the code follow GUI Programming and Java Swing best practices (e.g., MVC, EDT Safety)?
4.  **Deliverable:** Suggest time and space complexity improvements and apply edits as a team.

***

## ✍️ Deliverable: The Code Review Report (Submission)

You will present a formal slide deck that addresses the following sections. 

*Do not just list explanations of code; back up your description of the codebase with inference examples and sources.*
*Do not simply list errors; you must propose fixes and justify your critiques.*

**Section 1: GUI Program Description and Inference (Slide count will vary based on program size)**

Explain, in detail, the purpose of the overall program and all of its subcomponents. Describe what the individual functions do and explain vital aspects of components such as custom MVC patterns (e.g., ListCellModels and ActionListeners) and class constructors.

Describe important aspects of the codebase in plain speech while avoiding technical programming terms. 
Examples: 
1. This function inside of the component class allows us to access important subcomponents. 
2. This custom data structure object allows us to manage many unique sets of data at once, which provides much-needed enhancements in time complexity and API inference. 

**Section 2: Executive Summary (1–2 Slides)**
Provide a high-level summary of your findings. Start with an overall assessment of the original code's quality (e.g., "Excellent, minor polishing needed," or "Fails core requirements due to logical flaws"). Then, explain the improvements made to the codebase.

**Section 3: Detailed Critiques (2–4 Slides)**
Organize your feedback using bullet points, ensuring every critique specifies the **Line Number** and **Function Name** for the issue.

*   **❌ Functional/Bugs:** *What didn't work?* (Example: "Line 45: The loop terminates prematurely when the input list contains negative numbers, causing an incorrect total.")
*   **💡 Clarity/Design Flaws:** *What is confusing or poorly structured?* (Example: "Function `calculate_score` relies on a global variable, which makes the function difficult to test in isolation. Consider passing this as an argument.")
*   **🚀 Efficiency/Optimization:** *How can it be faster or cleaner?* (Example: "Using a nested `for` loop here results in $\mathcal{O}(n^2)$ complexity. This was optimized to $\mathcal{O}(n)$ by using a dictionary lookup for faster access.")

**Section 4: Action Plan (The Solution, 1 Slide)**
*   Write a concise, high-level "fix" for the top 1–2 issues you identified. Describe **what** needed to be changed, and crucially, **why** that change improved the code's quality or performance.

***

## 🏆 Grading Rubric: Code Critique Assessment

Your performance will be graded not just on the number of errors found, but on the *quality* and *professionalism* of your analysis and proposed solutions.

# Code Review & Technical Report Grading Rubric

| Criteria | Excellent (5 pts) | Proficient (3–4 pts) | Needs Improvement (0–2 pts) | Points Earned |
| :--- | :--- | :--- | :--- | :---: |
| **Description & Inference**<br>*(The Program)* | Carefully described every facet of the program and how to use it. Provided significant evidence that backs up descriptions and code inference examples. | Described the program generally but lacked specific evidence (e.g., line numbers, examples and docs). | Missed major functions or could not describe most aspects of the program accurately. | /5 |
| **Functional Diagnosis**<br>*(Identifying Bugs)* | Identified multiple, specific bugs and provided clear test cases that prove the bug exists. | Identified 1–2 bugs, but the explanation lacked specific evidence (e.g., line numbers, expected output). | Missed major bugs or could not identify any operational flaws. | /5 |
| **Structural Analysis**<br>*(Design & Readability)* | Provided actionable feedback on architecture (modularity, naming conventions) that significantly improves maintainability. | Identified general areas for improvement (e.g., "needs better naming") but lacked specific, detailed suggestions. | Only stated that the code was "messy" or "confusing" without concrete examples or fixes. | /5 |
| **Efficiency & Optimization**<br>*(Technical Depth)* | Proposed specific, quantifiable optimizations (e.g., shifting from $\mathcal{O}(n^2)$ to $\mathcal{O}(n)$) and thoroughly explained the technical justification. | Identified 1–2 inefficiencies but could not provide technical justification or alternative solutions. | Did not evaluate the code's performance or efficiency. | /5 |
| **Clarity & Professionalism**<br>*(Communication)* | Feedback was exceptionally constructive, respectful, and solution-oriented. Used professional technical language throughout. | Feedback was generally helpful but sometimes sounded overly critical or lacked a consistent constructive tone. | Feedback was vague, overly general, or was phrased as blame rather than technical critique. | /5 |
| **Scope & Completeness**<br>*(Thoroughness)* | The report was highly organized, comprehensive, and addressed all required elements (summary, detailed list, action plan). | Covered most topics but missed organization or depth in one area (e.g., only focused on bugs, ignoring efficiency). | The deliverable was incomplete, disorganized, or significantly missed the scope of the assignment. | /5 |
| **TOTAL SCORE** | | | | **/30** |