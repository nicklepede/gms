package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.SoftApConfiguration;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byhr;
import defpackage.cbpv;
import defpackage.cbpw;
import defpackage.cbqk;
import defpackage.cbqn;
import defpackage.cbqo;
import defpackage.cbrf;
import defpackage.cbrl;
import defpackage.cbrm;
import defpackage.cbrq;
import defpackage.cbtx;
import defpackage.cbty;
import defpackage.cbue;
import defpackage.cbux;
import defpackage.cbvo;
import defpackage.cbvp;
import defpackage.cbvu;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fpzd;
import defpackage.fpzk;
import defpackage.irn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ConnectTetheringResponder$TetheringResultReceiver extends ResultReceiver {
    public boolean a;
    private final Context b;
    private final cbqn c;
    private final cbux d;
    private final cbty e;
    private final cbvo f;
    private final cbvp g;

    public ConnectTetheringResponder$TetheringResultReceiver(Context context, cbqn cbqnVar, cbux cbuxVar, cbty cbtyVar, cbvo cbvoVar) {
        super(new byhr());
        this.a = false;
        this.b = context;
        this.c = cbqnVar;
        this.d = cbuxVar;
        this.e = cbtyVar;
        this.f = cbvoVar;
        this.g = new cbvp(cbvoVar);
    }

    private static final void a() {
        try {
            Context a = AppContextProvider.a();
            Intent flags = new Intent().setClassName(a, "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity").setFlags(268435456);
            String string = a.getString(R.string.magictether_provisioning_failed_host_dialog_title);
            String string2 = a.getString(R.string.magictether_provisioning_failed_host_dialog_content);
            flags.putExtra("dialog_content_title", string);
            flags.putExtra("dialog_content_message", string2);
            PendingIntent.getActivity(a, 0, flags, 134217728).send();
        } catch (PendingIntent.CanceledException e) {
            ((ejhf) ((ejhf) cbqo.a.j()).s(e)).x("Failed to show \"provisioning failed\" dialog.");
        }
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        String ssid;
        String passphrase;
        asot asotVar = cbqo.a;
        if (i == 0) {
            new cbpw(this.b, (byte[]) null).e("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", true);
            i = 0;
        }
        if (this.a) {
            new cbrl(this.b).c();
            this.g.a();
            return;
        }
        fecj v = cbtx.a.v();
        cbty cbtyVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        cbtx cbtxVar = (cbtx) v.b;
        cbtyVar.getClass();
        cbtxVar.f = cbtyVar;
        cbtxVar.b |= 8;
        if (cbpv.c(fpzk.j())) {
            Context a = AppContextProvider.a();
            int i2 = cbrm.a;
            cbue a2 = cbrm.a(a, new cbvo(a), (TelephonyManager) a.getSystemService("phone"), (WifiManager) a.getApplicationContext().getSystemService("wifi"));
            if (!v.b.L()) {
                v.U();
            }
            cbtx cbtxVar2 = (cbtx) v.b;
            a2.getClass();
            cbtxVar2.g = a2;
            cbtxVar2.b |= 16;
        }
        Context a3 = AppContextProvider.a();
        if (i == 0) {
            if (!v.b.L()) {
                v.U();
            }
            cbtx cbtxVar3 = (cbtx) v.b;
            cbtxVar3.c = 1;
            cbtxVar3.b |= 1;
            if (cbpv.c(fpzd.k()) && asqh.g()) {
                SoftApConfiguration softApConfiguration = ((WifiManager) this.b.getApplicationContext().getSystemService("wifi")).getSoftApConfiguration();
                ssid = softApConfiguration.getSsid();
                passphrase = softApConfiguration.getPassphrase();
                if (ssid == null || (passphrase == null && !fpzk.q())) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    cbtx cbtxVar4 = (cbtx) v.b;
                    cbtxVar4.c = 9;
                    cbtxVar4.b |= 1;
                    this.c.a((cbtx) v.Q());
                    return;
                }
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                cbtx cbtxVar5 = (cbtx) fecpVar;
                cbtxVar5.b |= 2;
                cbtxVar5.d = ssid;
                if (passphrase != null) {
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    cbtx cbtxVar6 = (cbtx) v.b;
                    cbtxVar6.b |= 4;
                    cbtxVar6.e = passphrase;
                }
            } else {
                WifiConfiguration b = this.f.b();
                if (cbpv.c(fpzd.k()) && b == null) {
                    ((ejhf) cbqo.a.i()).x("getWifiApConfiguration returned null");
                    if (!v.b.L()) {
                        v.U();
                    }
                    cbtx cbtxVar7 = (cbtx) v.b;
                    cbtxVar7.c = 10;
                    cbtxVar7.b |= 1;
                    this.c.a((cbtx) v.Q());
                    return;
                }
                String str = b.SSID;
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar8 = (cbtx) v.b;
                str.getClass();
                cbtxVar8.b |= 2;
                cbtxVar8.d = str;
                String str2 = b.preSharedKey;
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar9 = (cbtx) v.b;
                str2.getClass();
                cbtxVar9.b |= 4;
                cbtxVar9.e = str2;
            }
            if (cbpv.c(fpzk.j())) {
                cbqk.e(this.d);
                cbrf.b();
                cbrq.a(true, a3);
            } else {
                cbqk.d(this.d.a());
                cbvu.c().f(ApDisablingIntentOperation.a(AppContextProvider.a()));
                cbrq.a(true, a3);
            }
        } else {
            if (i == 1) {
                cbrq.a(false, a3);
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar10 = (cbtx) v.b;
                cbtxVar10.c = 2;
                cbtxVar10.b |= 1;
            } else if (i == 2) {
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar11 = (cbtx) v.b;
                cbtxVar11.c = 6;
                cbtxVar11.b |= 1;
            } else if (i == 3) {
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar12 = (cbtx) v.b;
                cbtxVar12.c = 7;
                cbtxVar12.b |= 1;
            } else {
                if (!v.b.L()) {
                    v.U();
                }
                cbtx cbtxVar13 = (cbtx) v.b;
                cbtxVar13.c = 0;
                cbtxVar13.b |= 1;
            }
            if (fpzk.a.a().P()) {
                cbvu c = cbvu.c();
                String str3 = cbtyVar.d;
                c.l(c.c, c.b(cbvu.n(), c.b.getString(R.string.magictether_host_hotspot_error_title_carrier_block), eiif.c(str3) ? c.b.getString(R.string.magictether_host_hotspot_error_message_carrier_block_no_carrier_specified) : c.b.getString(R.string.magictether_host_hotspot_error_message_carrier_block, irn.a().d(str3))).b(), 9);
            } else {
                a();
            }
            this.g.a();
        }
        this.c.a((cbtx) v.Q());
    }
}
