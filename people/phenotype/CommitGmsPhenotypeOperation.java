package com.google.android.gms.people.phenotype;

import android.content.SharedPreferences;
import defpackage.cufo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class CommitGmsPhenotypeOperation extends cufo {
    @Override // defpackage.cufo
    protected final SharedPreferences a() {
        return getSharedPreferences("ppl_pheno_gms_prefs", 0);
    }

    @Override // defpackage.cufo
    protected final String b() {
        return "com.google.android.gms.people";
    }
}
