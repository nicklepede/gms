package com.google.android.gms.smartdevice.setup.ui;

import android.nfc.NdefMessage;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import defpackage.a;
import defpackage.arkc;
import defpackage.arxo;
import defpackage.bp;
import defpackage.ddna;
import defpackage.ddqa;
import defpackage.deiw;
import defpackage.deix;
import defpackage.dekv;
import defpackage.dekw;
import defpackage.denq;
import defpackage.denx;
import defpackage.eiig;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.qex;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class D2DSourceNfcHandlerChimeraActivity extends qex implements dekv, deiw {
    private static final arxo i = new denq(new String[]{"D2DSourceNfcHandlerActivity"});
    SourceLogManager h;
    private ddna j;
    private boolean k;

    private final void j() {
        deix.x(1, getString(R.string.common_something_went_wrong), null, getString(R.string.common_ok), null, false).show(gI(), (String) null);
    }

    private final void k(ddna ddnaVar) {
        D2DDevice d2DDevice = new D2DDevice();
        d2DDevice.c = "unknown target device";
        Set set = d2DDevice.a;
        set.add(3);
        d2DDevice.b = 1;
        set.add(2);
        d2DDevice.d = ddnaVar.b;
        set.add(4);
        d2DDevice.e = (byte) 0;
        set.add(5);
        this.k = true;
        startActivity(D2DSetupChimeraActivity.q(this, d2DDevice, 1, this.j.d, this.h));
    }

    @Override // defpackage.dekv
    public final void G(int i2) {
        if (i2 == 0) {
            this.h.d();
            k(this.j);
        } else {
            i.f(a.j(i2, "Unknown text fragment id: "), new Object[0]);
        }
        finish();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ddna ddnaVar = null;
        arkc.f(this, null);
        setContentView(R.layout.smartdevice_fragment_container);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra == null) {
            j();
            return;
        }
        NdefMessage ndefMessage = (NdefMessage) parcelableArrayExtra[0];
        if (ndefMessage == null || ndefMessage.getRecords().length == 0) {
            j();
            return;
        }
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        try {
            fecp y = fecp.y(ddna.a, payload, 0, payload.length, febw.a());
            fecp.M(y);
            ddnaVar = (ddna) y;
        } catch (fedk e) {
            i.g("Invalid BootstrapInfo proto.", e, new Object[0]);
        }
        if (ddnaVar == null) {
            j();
            return;
        }
        this.j = ddnaVar;
        if (ddnaVar.c == 0) {
            i.f("Google Play services on target device is too old.", new Object[0]);
            j();
            return;
        }
        denx a = denx.a(this);
        if (a != null && a.d()) {
            i.d("Bluetooth already enabled. Skipping consent screen.", new Object[0]);
            k(this.j);
            finish();
        } else {
            if (bundle != null) {
                SourceLogManager sourceLogManager = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
                eiig.x(sourceLogManager);
                this.h = sourceLogManager;
                sourceLogManager.e = this;
                return;
            }
            SourceLogManager sourceLogManager2 = new SourceLogManager(this);
            this.h = sourceLogManager2;
            sourceLogManager2.h(1, ddqa.a(this));
            dekw x = dekw.x(getString(R.string.smartdevice_setup_intro_title), getString(R.string.smartdevice_intro_text_bt_only), getString(R.string.common_next));
            bp bpVar = new bp(gI());
            bpVar.F(R.id.fragment_container, x);
            bpVar.a();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        if (this.k || !isFinishing()) {
            return;
        }
        this.h.a();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("smartdevice.sourceLogManager", this.h);
    }

    @Override // defpackage.deiw
    public final void u(int i2, int i3) {
        finish();
    }
}
