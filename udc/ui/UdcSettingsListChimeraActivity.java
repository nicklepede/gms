package com.google.android.gms.udc.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.blzq;
import defpackage.dhcc;
import defpackage.ejhf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UdcSettingsListChimeraActivity extends qet {
    private static final asot j = asot.d();

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent b;
        super.onCreate(bundle);
        setContentView(new View(this));
        if (isFinishing() || isChangingConfigurations()) {
            return;
        }
        try {
            asng.B(this);
            Intent intent = getIntent();
            if (intent == null) {
                ((ejhf) ((ejhf) j.j()).ah((char) 11890)).x("No intent found.");
                setResult(0);
                finish();
                return;
            }
            try {
                String str = null;
                AccountData accountData = null;
                if (blzq.a(intent)) {
                    if (blzq.a(intent)) {
                        accountData = (AccountData) arxd.b(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
                    }
                    str = accountData.a;
                }
                if (str == null) {
                    b = dhcc.a();
                } else {
                    UdcSettingsListActivityRequest udcSettingsListActivityRequest = (UdcSettingsListActivityRequest) intent.getParcelableExtra("ClientRequestExtra");
                    if (udcSettingsListActivityRequest != null && udcSettingsListActivityRequest.a()) {
                        String str2 = udcSettingsListActivityRequest.a;
                        if (!"me".equalsIgnoreCase(str2)) {
                            b = dhcc.c(this, str, str2);
                        }
                    }
                    b = dhcc.b(str);
                }
                startActivityForResult(b, 0);
                setResult(-1);
            } catch (ActivityNotFoundException e) {
                ((ejhf) ((ejhf) ((ejhf) j.j()).s(e)).ah((char) 11889)).x("Account settings activity not found.");
                setResult(0);
            }
            finish();
        } catch (SecurityException e2) {
            ((ejhf) ((ejhf) ((ejhf) j.j()).s(e2)).ah((char) 11891)).x("Non-google signed package forbidden to access this Activity");
            setResult(0);
            finish();
        }
    }
}
