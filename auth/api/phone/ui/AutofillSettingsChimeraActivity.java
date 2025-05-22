package com.google.android.gms.auth.api.phone.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.abmq;
import defpackage.abms;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bp;
import defpackage.fnki;
import defpackage.ig;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AutofillSettingsChimeraActivity extends rxx {
    static {
        ausn.b("SmsRetriever", auid.SMS_RETRIEVER);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!auub.c()) {
            setTheme(R.style.SmsRetriever_Theme_GoogleSettings);
        }
        setContentView(R.layout.sms_code_autofill_settings_activity);
        String string = getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory);
        setTitle(string);
        ig hO = hO();
        if (hO != null) {
            hO.A(string);
            hO.o(true);
        }
        if (fnki.e()) {
            abms abmsVar = new abms();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.main_content, abmsVar, abmsVar.getClass().getName());
            bpVar.a();
            return;
        }
        abmq abmqVar = new abmq();
        bp bpVar2 = new bp(getSupportFragmentManager());
        bpVar2.z(R.id.main_content, abmqVar, abmqVar.getClass().getName());
        bpVar2.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
