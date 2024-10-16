import { RouteComponent } from "vue-router";

interface ScreenInterface {
    id: string;
    name: string;
    path: string;
    component: RouteComponent;
    children?: Record<string, ScreenDto>;
}

class ScreenDto implements ScreenInterface {
    id: string;
    name: string;
    path: string;
    component: RouteComponent;
    children?: Record<string, ScreenDto>;

    constructor(id: string, name: string, path: string, component: RouteComponent, children: Record<string, ScreenDto> = {}) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.component = component;
        this.children = children;
    }
}

export { ScreenInterface, ScreenDto };