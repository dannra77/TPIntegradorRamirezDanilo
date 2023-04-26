import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardSoftskillsComponent } from './hard-softskills.component';

describe('HardSoftskillsComponent', () => {
  let component: HardSoftskillsComponent;
  let fixture: ComponentFixture<HardSoftskillsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardSoftskillsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardSoftskillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
