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
import defpackage.ausn;
import defpackage.auub;
import defpackage.caqj;
import defpackage.cdyn;
import defpackage.cdyo;
import defpackage.cdzc;
import defpackage.cdzf;
import defpackage.cdzg;
import defpackage.cdzx;
import defpackage.cead;
import defpackage.ceae;
import defpackage.ceai;
import defpackage.cecp;
import defpackage.cecq;
import defpackage.cecw;
import defpackage.cedp;
import defpackage.ceeg;
import defpackage.ceeh;
import defpackage.ceem;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fssz;
import defpackage.fstg;
import defpackage.itd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ConnectTetheringResponder$TetheringResultReceiver extends ResultReceiver {
    public boolean a;
    private final Context b;
    private final cdzf c;
    private final cedp d;
    private final cecq e;
    private final ceeg f;
    private final ceeh g;

    public ConnectTetheringResponder$TetheringResultReceiver(Context context, cdzf cdzfVar, cedp cedpVar, cecq cecqVar, ceeg ceegVar) {
        super(new caqj());
        this.a = false;
        this.b = context;
        this.c = cdzfVar;
        this.d = cedpVar;
        this.e = cecqVar;
        this.f = ceegVar;
        this.g = new ceeh(ceegVar);
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
            ((eluo) ((eluo) cdzg.a.j()).s(e)).x("Failed to show \"provisioning failed\" dialog.");
        }
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        String ssid;
        String passphrase;
        ausn ausnVar = cdzg.a;
        if (i == 0) {
            new cdyo(this.b, (byte[]) null).e("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", true);
            i = 0;
        }
        if (this.a) {
            new cead(this.b).c();
            this.g.a();
            return;
        }
        fgrc v = cecp.a.v();
        cecq cecqVar = this.e;
        if (!v.b.L()) {
            v.U();
        }
        cecp cecpVar = (cecp) v.b;
        cecqVar.getClass();
        cecpVar.f = cecqVar;
        cecpVar.b |= 8;
        if (cdyn.c(fstg.j())) {
            Context a = AppContextProvider.a();
            int i2 = ceae.a;
            cecw a2 = ceae.a(a, new ceeg(a), (TelephonyManager) a.getSystemService("phone"), (WifiManager) a.getApplicationContext().getSystemService("wifi"));
            if (!v.b.L()) {
                v.U();
            }
            cecp cecpVar2 = (cecp) v.b;
            a2.getClass();
            cecpVar2.g = a2;
            cecpVar2.b |= 16;
        }
        Context a3 = AppContextProvider.a();
        if (i == 0) {
            if (!v.b.L()) {
                v.U();
            }
            cecp cecpVar3 = (cecp) v.b;
            cecpVar3.c = 1;
            cecpVar3.b |= 1;
            if (cdyn.c(fssz.k()) && auub.g()) {
                SoftApConfiguration softApConfiguration = ((WifiManager) this.b.getApplicationContext().getSystemService("wifi")).getSoftApConfiguration();
                ssid = softApConfiguration.getSsid();
                passphrase = softApConfiguration.getPassphrase();
                if (ssid == null || (passphrase == null && !fstg.q())) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    cecp cecpVar4 = (cecp) v.b;
                    cecpVar4.c = 9;
                    cecpVar4.b |= 1;
                    this.c.a((cecp) v.Q());
                    return;
                }
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                cecp cecpVar5 = (cecp) fgriVar;
                cecpVar5.b |= 2;
                cecpVar5.d = ssid;
                if (passphrase != null) {
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    cecp cecpVar6 = (cecp) v.b;
                    cecpVar6.b |= 4;
                    cecpVar6.e = passphrase;
                }
            } else {
                WifiConfiguration b = this.f.b();
                if (cdyn.c(fssz.k()) && b == null) {
                    ((eluo) cdzg.a.i()).x("getWifiApConfiguration returned null");
                    if (!v.b.L()) {
                        v.U();
                    }
                    cecp cecpVar7 = (cecp) v.b;
                    cecpVar7.c = 10;
                    cecpVar7.b |= 1;
                    this.c.a((cecp) v.Q());
                    return;
                }
                String str = b.SSID;
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar8 = (cecp) v.b;
                str.getClass();
                cecpVar8.b |= 2;
                cecpVar8.d = str;
                String str2 = b.preSharedKey;
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar9 = (cecp) v.b;
                str2.getClass();
                cecpVar9.b |= 4;
                cecpVar9.e = str2;
            }
            if (cdyn.c(fstg.j())) {
                cdzc.e(this.d);
                cdzx.b();
                ceai.a(true, a3);
            } else {
                cdzc.d(this.d.a());
                ceem.c().f(ApDisablingIntentOperation.a(AppContextProvider.a()));
                ceai.a(true, a3);
            }
        } else {
            if (i == 1) {
                ceai.a(false, a3);
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar10 = (cecp) v.b;
                cecpVar10.c = 2;
                cecpVar10.b |= 1;
            } else if (i == 2) {
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar11 = (cecp) v.b;
                cecpVar11.c = 6;
                cecpVar11.b |= 1;
            } else if (i == 3) {
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar12 = (cecp) v.b;
                cecpVar12.c = 7;
                cecpVar12.b |= 1;
            } else {
                if (!v.b.L()) {
                    v.U();
                }
                cecp cecpVar13 = (cecp) v.b;
                cecpVar13.c = 0;
                cecpVar13.b |= 1;
            }
            if (fstg.a.lK().P()) {
                ceem c = ceem.c();
                String str3 = cecqVar.d;
                c.l(c.c, c.b(ceem.n(), c.b.getString(R.string.magictether_host_hotspot_error_title_carrier_block), ekvk.c(str3) ? c.b.getString(R.string.magictether_host_hotspot_error_message_carrier_block_no_carrier_specified) : c.b.getString(R.string.magictether_host_hotspot_error_message_carrier_block, itd.a().d(str3))).b(), 9);
            } else {
                a();
            }
            this.g.a();
        }
        this.c.a((cecp) v.Q());
    }
}
