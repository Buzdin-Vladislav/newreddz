﻿<?xml version="1.0" encoding="utf-8"?>
<Project ToolsVersion="14.0" DefaultTargets="Build" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
  <Import Project="$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props" Condition="Exists('$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props')" />
  <PropertyGroup>
    <Configuration Condition=" '$(Configuration)' == '' ">Debug</Configuration>
    <Platform Condition=" '$(Platform)' == '' ">AnyCPU</Platform>
    <SchemaVersion>2.0</SchemaVersion>
    <ProjectGuid>{563e07be-1234-45e4-8352-00b95094c91f}</ProjectGuid>
    <ArchitectureToolsVersion>2.0.0.0</ArchitectureToolsVersion>
    <Name>CompServiceUseCase</Name>
    <RootNamespace>CompServiceUseCase</RootNamespace>
  </PropertyGroup>
  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Debug|AnyCPU' ">
    <OutputPath>bin\Debug\</OutputPath>
  </PropertyGroup>
  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Release|AnyCPU' ">
    <OutputPath>bin\Release\</OutputPath>
  </PropertyGroup>
  <PropertyGroup>
    <VisualStudioVersion Condition="'$(VisualStudioVersion)' == ''">10.0</VisualStudioVersion>
    <VSToolsPath Condition="'$(VSToolsPath)' == ''">$(MSBuildExtensionsPath)\Microsoft\VisualStudio\v$(VisualStudioVersion)</VSToolsPath>
  </PropertyGroup>
  <Import Project="$(VSToolsPath)\ArchitectureTools\Microsoft.VisualStudio.TeamArchitect.ModelingProject.targets" Condition="'$(VSToolsPath)' != ''" />
  <ItemGroup>
    <Folder Include="ModelDefinition\" />
    <Content Include="CompService.usecasediagram">
      <SubType>Content</SubType>
    </Content>
    <Content Include="CompService.usecasediagram.layout">
      <SubType>Content</SubType>
      <DependentUpon>CompService.usecasediagram</DependentUpon>
    </Content>
    <Content Include="ModelDefinition\CompServiceUseCase.uml">
      <SubType>Content</SubType>
    </Content>
  </ItemGroup>
</Project>