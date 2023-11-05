package tn.esprit.kaddemproject.service;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.kaddemproject.entities.Etudiant;
import tn.esprit.kaddemproject.entities.Option;
import tn.esprit.kaddemproject.repositories.EtudiantRepository;
import tn.esprit.kaddemproject.services.IEtudiantServiceImp;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EtudiantServiceImplTest {
    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private IEtudiantServiceImp iEtudiantServiceImp;

    @Test
    public void testRetrieveAllEtudiant() {
        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant();
        List<Etudiant> etudiantList = Arrays.asList(etudiant1, etudiant2);

        when(etudiantRepository.findAll()).thenReturn(etudiantList);

        List<Etudiant> retrievedEtudiant = iEtudiantServiceImp.retrieveAllE();

        assertEquals(2, retrievedEtudiant.size());
    }





}