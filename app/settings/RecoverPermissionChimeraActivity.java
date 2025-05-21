package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ascr;
import defpackage.qfp;
import defpackage.tqm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RecoverPermissionChimeraActivity extends qfp {
    private Set j;

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && ascr.b.d(this.j).isEmpty()) {
            setResult(-1);
        } else {
            setResult(0);
        }
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("requiredGroups");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        this.j = new HashSet(stringArrayListExtra);
        Set d = ascr.b.d(this.j);
        if (d.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        tqm tqmVar = new tqm();
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("missingGroups", new ArrayList<>(d));
        tqmVar.setArguments(bundle2);
        tqmVar.show(getSupportFragmentManager(), "PermissionsDialog");
    }
}
