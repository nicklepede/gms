package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.aufg;
import defpackage.ryt;
import defpackage.vmm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RecoverPermissionChimeraActivity extends ryt {
    private Set j;

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && aufg.b.d(this.j).isEmpty()) {
            setResult(-1);
        } else {
            setResult(0);
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("requiredGroups");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        this.j = new HashSet(stringArrayListExtra);
        Set d = aufg.b.d(this.j);
        if (d.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        vmm vmmVar = new vmm();
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("missingGroups", new ArrayList<>(d));
        vmmVar.setArguments(bundle2);
        vmmVar.show(getSupportFragmentManager(), "PermissionsDialog");
    }
}
