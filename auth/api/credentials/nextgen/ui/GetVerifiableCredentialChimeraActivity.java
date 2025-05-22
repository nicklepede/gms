package com.google.android.gms.auth.api.credentials.nextgen.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.nextgen.ui.GetVerifiableCredentialChimeraActivity;
import defpackage.aasz;
import defpackage.aatj;
import defpackage.aatk;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetVerifiableCredentialChimeraActivity extends rxx {
    public aasz j;
    private aatk k;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aatk aatkVar = (aatk) new jxw(this, new aatj(getIntent())).a(aatk.class);
        this.k = aatkVar;
        aatkVar.c.g(this, new jvs() { // from class: aasx
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ymm ymmVar = (ymm) obj;
                int a = ymmVar.a();
                Intent b = ymmVar.b();
                GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity = GetVerifiableCredentialChimeraActivity.this;
                getVerifiableCredentialChimeraActivity.setResult(a, b);
                getVerifiableCredentialChimeraActivity.finish();
            }
        });
        this.k.b.g(this, new jvs() { // from class: aasy
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity = GetVerifiableCredentialChimeraActivity.this;
                if (intValue == 1) {
                    ew supportFragmentManager = getVerifiableCredentialChimeraActivity.getSupportFragmentManager();
                    if (supportFragmentManager.h("GetVerifiableCredentialLoadingFragment") == null) {
                        getVerifiableCredentialChimeraActivity.j = new aasz();
                        getVerifiableCredentialChimeraActivity.j.show(supportFragmentManager, "GetVerifiableCredentialLoadingFragment");
                        return;
                    }
                    return;
                }
                if (intValue != 2) {
                    return;
                }
                ew supportFragmentManager2 = getVerifiableCredentialChimeraActivity.getSupportFragmentManager();
                if (supportFragmentManager2.h("GetVerifiableCredentialBiometricFragment") == null) {
                    aasw aaswVar = new aasw();
                    bp bpVar = new bp(supportFragmentManager2);
                    bpVar.v(aaswVar, "GetVerifiableCredentialBiometricFragment");
                    bpVar.d();
                }
            }
        });
        setTheme(R.style.ThemeTranslucentDayNight);
        this.k.e.i();
    }
}
