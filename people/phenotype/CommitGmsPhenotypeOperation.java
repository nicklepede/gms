package com.google.android.gms.people.phenotype;

import android.content.SharedPreferences;
import defpackage.cwov;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CommitGmsPhenotypeOperation extends cwov {
    @Override // defpackage.cwov
    protected final SharedPreferences a() {
        return getSharedPreferences("ppl_pheno_gms_prefs", 0);
    }

    @Override // defpackage.cwov
    protected final String b() {
        return "com.google.android.gms.people";
    }
}
