package com.google.android.gms.udc.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bogi;
import defpackage.djni;
import defpackage.eluo;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcSettingsListChimeraActivity extends rxx {
    private static final ausn j = ausn.d();

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent b;
        super.onCreate(bundle);
        setContentView(new View(this));
        if (isFinishing() || isChangingConfigurations()) {
            return;
        }
        try {
            aura.B(this);
            Intent intent = getIntent();
            if (intent == null) {
                ((eluo) ((eluo) j.j()).ai((char) 11893)).x("No intent found.");
                setResult(0);
                finish();
                return;
            }
            try {
                String str = null;
                AccountData accountData = null;
                if (bogi.a(intent)) {
                    if (bogi.a(intent)) {
                        accountData = (AccountData) atzs.b(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
                    }
                    str = accountData.a;
                }
                if (str == null) {
                    b = djni.a();
                } else {
                    UdcSettingsListActivityRequest udcSettingsListActivityRequest = (UdcSettingsListActivityRequest) intent.getParcelableExtra("ClientRequestExtra");
                    if (udcSettingsListActivityRequest != null && udcSettingsListActivityRequest.a()) {
                        String str2 = udcSettingsListActivityRequest.a;
                        if (!"me".equalsIgnoreCase(str2)) {
                            b = djni.c(this, str, str2);
                        }
                    }
                    b = djni.b(str);
                }
                startActivityForResult(b, 0);
                setResult(-1);
            } catch (ActivityNotFoundException e) {
                ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 11892)).x("Account settings activity not found.");
                setResult(0);
            }
            finish();
        } catch (SecurityException e2) {
            ((eluo) ((eluo) ((eluo) j.j()).s(e2)).ai((char) 11894)).x("Non-google signed package forbidden to access this Activity");
            setResult(0);
            finish();
        }
    }
}
