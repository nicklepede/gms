package com.google.android.gms.smartdevice.setup.ui;

import android.nfc.NdefMessage;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import defpackage.a;
import defpackage.atmr;
import defpackage.auad;
import defpackage.bp;
import defpackage.dfyf;
import defpackage.dgbf;
import defpackage.dgtz;
import defpackage.dgua;
import defpackage.dgvy;
import defpackage.dgvz;
import defpackage.dgyt;
import defpackage.dgza;
import defpackage.ekvl;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.ryb;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class D2DSourceNfcHandlerChimeraActivity extends ryb implements dgvy, dgtz {
    private static final auad i = new dgyt(new String[]{"D2DSourceNfcHandlerActivity"});
    SourceLogManager h;
    private dfyf j;
    private boolean k;

    private final void j() {
        dgua.x(1, getString(R.string.common_something_went_wrong), null, getString(R.string.common_ok), null, false).show(gY(), (String) null);
    }

    private final void k(dfyf dfyfVar) {
        D2DDevice d2DDevice = new D2DDevice();
        d2DDevice.c = "unknown target device";
        Set set = d2DDevice.a;
        set.add(3);
        d2DDevice.b = 1;
        set.add(2);
        d2DDevice.d = dfyfVar.b;
        set.add(4);
        d2DDevice.e = (byte) 0;
        set.add(5);
        this.k = true;
        startActivity(D2DSetupChimeraActivity.q(this, d2DDevice, 1, this.j.d, this.h));
    }

    @Override // defpackage.dgvy
    public final void G(int i2) {
        if (i2 == 0) {
            this.h.d();
            k(this.j);
        } else {
            i.f(a.j(i2, "Unknown text fragment id: "), new Object[0]);
        }
        finish();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dfyf dfyfVar = null;
        atmr.f(this, null);
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
            fgri y = fgri.y(dfyf.a, payload, 0, payload.length, fgqp.a());
            fgri.M(y);
            dfyfVar = (dfyf) y;
        } catch (fgsd e) {
            i.g("Invalid BootstrapInfo proto.", e, new Object[0]);
        }
        if (dfyfVar == null) {
            j();
            return;
        }
        this.j = dfyfVar;
        if (dfyfVar.c == 0) {
            i.f("Google Play services on target device is too old.", new Object[0]);
            j();
            return;
        }
        dgza a = dgza.a(this);
        if (a != null && a.d()) {
            i.d("Bluetooth already enabled. Skipping consent screen.", new Object[0]);
            k(this.j);
            finish();
        } else {
            if (bundle != null) {
                SourceLogManager sourceLogManager = (SourceLogManager) bundle.getParcelable("smartdevice.sourceLogManager");
                ekvl.y(sourceLogManager);
                this.h = sourceLogManager;
                sourceLogManager.e = this;
                return;
            }
            SourceLogManager sourceLogManager2 = new SourceLogManager(this);
            this.h = sourceLogManager2;
            sourceLogManager2.h(1, dgbf.a(this));
            dgvz x = dgvz.x(getString(R.string.smartdevice_setup_intro_title), getString(R.string.smartdevice_intro_text_bt_only), getString(R.string.common_next));
            bp bpVar = new bp(gY());
            bpVar.F(R.id.fragment_container, x);
            bpVar.a();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        if (this.k || !isFinishing()) {
            return;
        }
        this.h.a();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("smartdevice.sourceLogManager", this.h);
    }

    @Override // defpackage.dgtz
    public final void u(int i2, int i3) {
        finish();
    }
}
