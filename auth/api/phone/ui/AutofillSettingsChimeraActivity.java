package com.google.android.gms.auth.api.phone.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bp;
import defpackage.fkth;
import defpackage.ig;
import defpackage.qet;
import defpackage.zmq;
import defpackage.zms;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AutofillSettingsChimeraActivity extends qet {
    static {
        asot.b("SmsRetriever", asej.SMS_RETRIEVER);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!asqh.c()) {
            setTheme(R.style.SmsRetriever_Theme_GoogleSettings);
        }
        setContentView(R.layout.sms_code_autofill_settings_activity);
        String string = getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory);
        setTitle(string);
        ig hy = hy();
        if (hy != null) {
            hy.A(string);
            hy.o(true);
        }
        if (fkth.e()) {
            zms zmsVar = new zms();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.main_content, zmsVar, zmsVar.getClass().getName());
            bpVar.a();
            return;
        }
        zmq zmqVar = new zmq();
        bp bpVar2 = new bp(getSupportFragmentManager());
        bpVar2.z(R.id.main_content, zmqVar, zmqVar.getClass().getName());
        bpVar2.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
