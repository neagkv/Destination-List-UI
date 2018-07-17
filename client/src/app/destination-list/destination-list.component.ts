import { DestinationService } from '../shared/destination/destination.service';

export class DestinationListComponent implements OnInit {
cars: Array<any>;

constructor(private destinationService: DestinationService) { }

  ngOnInit() {
    this.destinationService.getAll().subscribe(data => {
      this.destination = data;
    });
  }
}
