package com.example.demo.utils;

import com.example.demo.modal.SubSubSubTypes;
import com.example.demo.modal.SubTypes;
import com.example.demo.modal.SubTypesOfSubTypes;
import com.example.demo.modal.Types;
import com.example.demo.repository.SubSubSubTypesRepository;
import com.example.demo.repository.SubTypesOfSubTypesRepository;
import com.example.demo.repository.SubTypesRepository;
import com.example.demo.repository.TypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final TypesRepository typesRepository;
    private final SubTypesRepository subTypesRepository;
    private final SubTypesOfSubTypesRepository subTypesOfSubTypesRepository;
    private final SubSubSubTypesRepository subSubSubTypesRepository;

    @Autowired
    public DataLoader(TypesRepository typesRepository, SubTypesRepository subTypesRepository, SubTypesOfSubTypesRepository subTypesOfSubTypesRepository, SubSubSubTypesRepository subSubSubTypesRepository) {
        this.typesRepository = typesRepository;
        this.subTypesRepository = subTypesRepository;
        this.subTypesOfSubTypesRepository = subTypesOfSubTypesRepository;
        this.subSubSubTypesRepository = subSubSubTypesRepository;
    }

    public void run(ApplicationArguments args) {
        //Types
        typesRepository.save(new Types(1L, "Manufacturing"));
        typesRepository.save(new Types(2L, "Service"));
        typesRepository.save(new Types(3L, "Other"));
        //SubTypes
        subTypesRepository.save(new SubTypes(19L, "Construction materials", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(18L, "Electronics and Optics", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(6L, "Food and Beverage", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(13L, "Furniture", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(12L, "Machinery", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(11L, "Metalworking", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(9L, "Plastic and Rubber", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(5L, "Printing", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(7L, "Textile and Clothing", typesRepository.getById(1L)));
        subTypesRepository.save(new SubTypes(8L, "Wood", typesRepository.getById(1L)));

        subTypesRepository.save(new SubTypes(37L, "Creative industries", typesRepository.getById(3L)));
        subTypesRepository.save(new SubTypes(29L, "Energy technology", typesRepository.getById(3L)));
        subTypesRepository.save(new SubTypes(33L, "Environment", typesRepository.getById(3L)));

        subTypesRepository.save(new SubTypes(25L, "Business services", typesRepository.getById(2L)));
        subTypesRepository.save(new SubTypes(35L, "Engineering", typesRepository.getById(2L)));
        subTypesRepository.save(new SubTypes(28L, "Information Technology and Telecommunications", typesRepository.getById(2L)));
        subTypesRepository.save(new SubTypes(22L, "Tourism", typesRepository.getById(2L)));
        subTypesRepository.save(new SubTypes(141L, "Translation services", typesRepository.getById(2L)));
        subTypesRepository.save(new SubTypes(21L, "Transport and Logistics", typesRepository.getById(2L)));
        //SubTypesOfSubTypes
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(342L, "Bakery & confectionery products", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(43L, "Beverages", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(42L, "Fish & fish products", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(40L, "Meat & meat products", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(39L, "Milk & dairy products", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(437L, "Other", subTypesRepository.getById(6L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(378L, "Sweets & snack food", subTypesRepository.getById(6L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(389L, "Bathroom/sauna", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(385L, "Bedroom", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(390L, "Childrenâ€™s room", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(98L, "Kitchen", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(101L, "Living room", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(392L, "Office", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(394L, "Other (Furniture)", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(341L, "Outdoor", subTypesRepository.getById(13L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(99L, "Project furniture", subTypesRepository.getById(13L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(94L, "Machinery components", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(91L, "Machinery equipment/tools", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(224L, "Manufacture of machinery", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(97L, "Maritime", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(93L, "Metal structures", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(508L, "Other", subTypesRepository.getById(12L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(227L, "Repair and maintenance service", subTypesRepository.getById(12L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(67L, "Construction of metal structures", subTypesRepository.getById(11L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(263L, "Houses and buildings", subTypesRepository.getById(11L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(267L, "Metal products", subTypesRepository.getById(11L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(542L, "Metal works", subTypesRepository.getById(11L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(54L, "Packaging", subTypesRepository.getById(9L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(556L, "Plastic goods", subTypesRepository.getById(9L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(559L, "Plastic processing technology", subTypesRepository.getById(9L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(560L, "Plastic profiles", subTypesRepository.getById(9L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(148L, "Advertising", subTypesRepository.getById(5L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(150L, "Book/Periodicals printing", subTypesRepository.getById(5L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(145L, "Labelling and packaging printing", subTypesRepository.getById(5L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(44L, "Clothing", subTypesRepository.getById(7L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(45L, "Textile", subTypesRepository.getById(7L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(337L, "Other (Wood)", subTypesRepository.getById(8L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(51L, "Wooden building materials", subTypesRepository.getById(8L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(47L, "Wooden houses", subTypesRepository.getById(8L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(581L, "Data processing, Web portals, E-marketing", subTypesRepository.getById(28L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(576L, "Programming, Consultancy", subTypesRepository.getById(28L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(121L, "Software, Hardware", subTypesRepository.getById(28L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(122L, "Telecommunications", subTypesRepository.getById(28L)));

        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(111L, "Air", subTypesRepository.getById(21L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(114L, "Rail", subTypesRepository.getById(21L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(112L, "Road", subTypesRepository.getById(21L)));
        subTypesOfSubTypesRepository.save(new SubTypesOfSubTypes(113L, "Water", subTypesRepository.getById(21L)));
        //SubSubSubTypes
        subSubSubTypesRepository.save(new SubSubSubTypes(271L, "Aluminium and steel workboats", subTypesOfSubTypesRepository.getById(97L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(269L, "Boat/Yacht building", subTypesOfSubTypesRepository.getById(97L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(230L, "Ship repair and conversion", subTypesOfSubTypesRepository.getById(97L)));

        subSubSubTypesRepository.save(new SubSubSubTypes(75L, "CNC-machining", subTypesOfSubTypesRepository.getById(542L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(62L, "Forgings, Fasteners", subTypesOfSubTypesRepository.getById(542L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(69L, "Gas, Plasma, Laser cutting", subTypesOfSubTypesRepository.getById(542L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(66L, "MIG, TIG, Aluminum welding", subTypesOfSubTypesRepository.getById(542L)));

        subSubSubTypesRepository.save(new SubSubSubTypes(55L, "Blowing", subTypesOfSubTypesRepository.getById(559L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(57L, "Moulding", subTypesOfSubTypesRepository.getById(559L)));
        subSubSubTypesRepository.save(new SubSubSubTypes(53L, "Plastics welding and processing", subTypesOfSubTypesRepository.getById(559L)));
    }
}
