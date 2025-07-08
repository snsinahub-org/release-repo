# Automated Release Repository

[![release-action](https://github.com/snsinahub-org/release-repo/actions/workflows/release.yml/badge.svg)](https://github.com/snsinahub-org/release-repo/actions/workflows/release.yml)
[![package and deploy](https://github.com/snsinahub-org/release-repo/actions/workflows/package-and-deploy.yml/badge.svg)](https://github.com/snsinahub-org/release-repo/actions/workflows/package-and-deploy.yml)
[![Auto release call deploy](https://github.com/snsinahub-org/release-repo/actions/workflows/auto-release.yml/badge.svg)](https://github.com/snsinahub-org/release-repo/actions/workflows/auto-release.yml)

## Overview

This repository demonstrates **automated release workflows** for a Spring Boot web application using GitHub Actions. It showcases various release automation patterns, semantic versioning, and deployment strategies that can be applied to enterprise software development workflows.

## 🚀 Project Architecture

### Application Structure
- **Framework**: Spring Boot 2.6.3 with Java 8
- **Build Tool**: Maven with wrapper
- **Main Application**: `com.example.springboot.Application`
- **REST Endpoint**: `HelloController` serving "Greetings from Spring Boot!" at root URL
- **Testing**: JUnit 5 test framework

### 📚 Additional Documentation
- **[Demo Guide](Demo.md)**: Detailed walkthrough of the application structure and build process
- **[Help & References](HELP.md)**: Spring Boot documentation and useful guides

### Key Features
- RESTful web service
- Maven-based build system
- Comprehensive GitHub Actions workflows
- Multi-environment deployment support
- Semantic versioning automation
- Security scanning and dependency management

## 🔧 Development Setup

### Prerequisites
- Java 8 or higher
- Maven 3.x (or use included wrapper)
- Git

### Quick Start

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd automated-release-main
   ```

2. **Build the application**
   ```bash
   ./mvnw clean package
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Test the endpoint**
   ```bash
   curl http://localhost:8080
   # Returns: "Greetings from Spring Boot!"
   ```

5. **Run tests**
   ```bash
   ./mvnw test
   ```

## 🚀 Release Automation Workflows

This repository includes multiple GitHub Actions workflows demonstrating different release strategies:

### Core Release Workflows

| Workflow | Trigger | Purpose |
|----------|---------|---------|
| `auto-release.yml` | Push to main | Automatic release based on PR labels |
| `release.yml` | Manual/Push | Full release with artifact building |
| `manual-release.yml` | Manual | Manual release with version selection |
| `package-and-deploy.yml` | Manual | Package and deploy to GitHub Packages |

### Release Features

#### 🏷️ Semantic Versioning
- **Automatic version bumping** based on PR labels:
  - `MAJOR`: Breaking changes (x.0.0)
  - `MINOR`: New features (0.x.0) 
  - `PATCH`: Bug fixes (0.0.x)
- **Custom semver action**: Uses `snsinahub-org/semver` for version management
- **Changelog generation**: Automated changelog from commits and PRs

#### 📦 Artifact Management
- **Maven artifact building**: Compiles JAR files
- **GitHub Packages**: Publishes to GitHub Package Registry
- **Release assets**: Attaches JAR files to GitHub releases
- **SBOM generation**: Software Bill of Materials for security compliance

#### 🔄 Deployment Pipeline
- **Multi-environment**: Sandbox → UAT → Production
- **Environment protection**: Manual approvals for production
- **Artifact promotion**: Same artifact deployed across environments
- **Deployment tracking**: Status badges and reporting

### Advanced Workflows

#### 🔍 Quality & Security
- `super-linter.yml`: Code linting across multiple languages
- `dependency-review-action.yml`: Dependency vulnerability scanning
- `scorecard.yml`: OSSF Scorecard security assessment
- `sbom.yml`: Software Bill of Materials generation

#### 🔧 Utility Workflows
- `semver.yml`: Semantic version testing
- `list-releases.yml`: Release management utilities
- `download-release.yml`: Release asset retrieval
- `creat-pr-from-tag.yml`: Tag-based PR creation

## 📋 Configuration Files

### Maven Configuration
- `pom.xml`: Project dependencies and build configuration
- `.mvn/local-settings.xml`: GitHub Packages authentication
- `config/m2-settings.xml`: Alternative Maven settings

### GitHub Configuration
- `.github/release.yml`: Release notes configuration
- `.github/pull_request_template.md`: PR template
- `azure-pipelines.yml`: Azure DevOps pipeline (legacy)

## 🔐 Security Considerations

### Environment Variables
The following environment variables are required for full functionality:
- `S_TOKEN`: GitHub token for package publishing
- `USERNAME`: GitHub username for authentication
- `GITHUB_TOKEN`: Automatic GitHub Actions token

### Security Features
- No hardcoded secrets in repository
- Environment-based authentication
- Dependency vulnerability scanning
- Security policy enforcement through workflows

## 🎯 Usage Examples

### Triggering Releases

#### Automatic Release (Recommended)
1. Create a PR with appropriate labels (`MAJOR`, `MINOR`, or `PATCH`)
2. Merge to main branch
3. Release is automatically created with proper semantic version

#### Manual Release
1. Go to Actions → Manual release
2. Select release type (MAJOR/MINOR/PATCH)
3. Specify branch and version prefix
4. Trigger workflow

#### Package Deployment
1. Go to Actions → package and deploy
2. Enter desired version number
3. Deploys to GitHub Packages

### Deployment Environments
- **Sandbox**: Development testing environment
- **UAT**: User acceptance testing
- **Production**: Live environment (requires approval)

## 🤝 Contributing

### PR Guidelines
- Use semantic versioning labels (`MAJOR`, `MINOR`, `PATCH`)
- Follow the PR template
- Ensure all tests pass
- Update documentation as needed

### Release Process
1. Create feature branch
2. Implement changes
3. Add appropriate tests
4. Create PR with semantic label
5. Code review and merge
6. Automatic release triggered

## 📊 Monitoring & Observability

- **Workflow status badges**: Real-time pipeline status
- **Release tracking**: GitHub releases with changelogs
- **Artifact management**: GitHub Packages integration
- **Security scanning**: Automated vulnerability detection

## 🛠️ Troubleshooting

### Common Issues
1. **Build failures**: Check Java/Maven versions
2. **Authentication errors**: Verify GitHub tokens
3. **Test failures**: Run tests locally first
4. **Deployment issues**: Check environment configurations

### Debug Resources
- GitHub Actions logs
- Maven build output
- Application logs via Spring Boot Actuator

## 📄 License & Support

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

This is a demonstration repository for release automation patterns. Adapt the workflows to your organization's needs and security requirements.

### 📖 Documentation Resources
- **[Demo Guide](Demo.md)**: Complete application overview and development setup
- **[Help & References](HELP.md)**: Spring Boot documentation, Maven guides, and external resources

For questions or support, refer to the GitHub Actions documentation and Spring Boot guides.
  
