package com.google.android.gms.smartdevice.d2d.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.atmr;
import defpackage.atzb;
import defpackage.auad;
import defpackage.bp;
import defpackage.dfgj;
import defpackage.dfjk;
import defpackage.dfqf;
import defpackage.dfqh;
import defpackage.dfql;
import defpackage.dfqm;
import defpackage.dfqn;
import defpackage.dfqo;
import defpackage.dfvz;
import defpackage.dfyy;
import defpackage.dfyz;
import defpackage.dfzy;
import defpackage.dfzz;
import defpackage.dg;
import defpackage.dgys;
import defpackage.dgyt;
import defpackage.dgyx;
import defpackage.eaab;
import defpackage.eofb;
import defpackage.eofc;
import defpackage.eofe;
import defpackage.eoff;
import defpackage.eofi;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgrr;
import defpackage.fvak;
import defpackage.fvay;
import defpackage.ryb;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AtvSetupChimeraActivity extends ryb implements dfyy, dfqf {
    private static final auad l = new dgyt(new String[]{"AtvSetupActivity"});
    InetAddress h;
    String i;
    public int j = -1;
    public dfgj k;
    private dfqh m;
    private int n;
    private Integer o;
    private boolean p;
    private boolean q;
    private dfvz r;

    private final void j(dg dgVar) {
        bp bpVar = new bp(gY());
        bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.b();
    }

    private final void k(InetAddress inetAddress) {
        dfqh dfqhVar = this.m;
        if (dfqhVar != null) {
            dfqhVar.a();
        }
        atzb.s(inetAddress);
        String str = this.i;
        atzb.s(str);
        dfqh dfqhVar2 = new dfqh(this, inetAddress, str, this, this.r);
        this.m = dfqhVar2;
        final dfqo dfqoVar = dfqhVar2.c;
        dgyx.a();
        if (dfqoVar.e) {
            throw new IllegalStateException("Controller is already started!");
        }
        dfqoVar.e = true;
        dfqn dfqnVar = dfqoVar.c;
        dgyx.a();
        dfqh dfqhVar3 = (dfqh) dfqnVar;
        dfqhVar3.e = 1;
        dfqhVar3.d.b(1);
        dfqoVar.i = new dfqm(dfqnVar, Looper.getMainLooper());
        eqgo eqgoVar = dfqoVar.d;
        eqgl submit = eqgoVar.submit(new Callable() { // from class: dfqj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dgyt dgytVar = dfqo.a;
                final dfqo dfqoVar2 = dfqo.this;
                InetAddress inetAddress2 = dfqoVar2.b;
                dgytVar.d("Opening socket connection to %s:%d...", inetAddress2.getHostAddress(), 45454);
                InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress2, 45454);
                synchronized (dfqp.a) {
                }
                Socket socket = new Socket();
                socket.setTcpNoDelay(false);
                socket.setKeepAlive(true);
                dfqoVar2.f = socket;
                dfqoVar2.f.connect(inetSocketAddress, (int) fvay.a.lK().a());
                dfqoVar2.h = new DataOutputStream(dfqoVar2.f.getOutputStream());
                dfqoVar2.i.obtainMessage(2).sendToTarget();
                dfqoVar2.g = new dgxz(dfqoVar2.f.getInputStream(), new dgxy() { // from class: dfqk
                    @Override // defpackage.dgxy
                    public final void a(byte[] bArr) {
                        dfqo.this.i.obtainMessage(1, bArr).sendToTarget();
                    }
                }, 1);
                eqgo eqgoVar2 = dfqoVar2.d;
                eqgc.t(eqgoVar2.submit(dfqoVar2.g), new dfql(dfqoVar2), eqgoVar2);
                return null;
            }
        });
        eqgc.t(submit, new dfql(dfqoVar), eqgoVar);
        if (this.p) {
            eqgc.t(submit, new dfyz(this), eqex.a);
        }
    }

    @Override // defpackage.dfqf
    public final void a(int i) {
        int i2;
        int i3;
        if (this.q) {
            dfvz dfvzVar = this.r;
            fgrc fgrcVar = dfvzVar.e;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eoff eoffVar = (eoff) fgrcVar.b;
            eoff eoffVar2 = eoff.a;
            fgrr fgrrVar = eoffVar.f;
            if (!fgrrVar.c()) {
                eoffVar.f = fgri.C(fgrrVar);
            }
            eoffVar.f.i(i);
            dfvzVar.a(SystemClock.elapsedRealtime());
            dfvzVar.f = null;
            this.r.c(false);
        }
        boolean z = true;
        if (this.p) {
            dfgj dfgjVar = this.k;
            atzb.s(dfgjVar);
            ((eaab) dfgjVar.k.lK()).b(Integer.valueOf(i), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
        }
        auad auadVar = l;
        Integer valueOf = Integer.valueOf(i);
        auadVar.f("onAtvSetupError: %d", valueOf);
        this.o = valueOf;
        if (i == -6) {
            finishAndRemoveTask();
            return;
        }
        if (i == -2) {
            i2 = R.string.smartdevice_atv_connection_error_title;
            i3 = R.string.smartdevice_atv_error_network_description;
        } else {
            if (i == -11) {
                i2 = R.string.smartdevice_atv_error_title;
                i3 = R.string.smartdevice_atv_error_qr_code_description;
            } else {
                i2 = R.string.smartdevice_connection_error;
                i3 = R.string.smartdevice_atv_error_generic_description;
            }
            z = false;
        }
        dfzy dfzyVar = new dfzy();
        dfzyVar.b = getString(i2);
        dfzyVar.c = getString(i3);
        dfzyVar.e = false;
        dfzyVar.a = 2131233636;
        dfzyVar.f(getString(R.string.common_cancel), 2000);
        if (z) {
            dfzyVar.e(getString(R.string.common_try_again), 2001);
        }
        j(dfzyVar.a());
    }

    @Override // defpackage.dfqf
    public final void b(int i) {
        fgrc fgrcVar;
        dfzz dfzzVar = null;
        if (this.q) {
            dfvz dfvzVar = this.r;
            int a = eofe.a(i);
            fgrc fgrcVar2 = dfvzVar.e;
            int a2 = eofe.a(((eoff) fgrcVar2.b).e);
            if (a2 != 0 && a2 == 6) {
                throw new IllegalStateException("Cannot change state once in the COMPLETED state");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dfvzVar.a(elapsedRealtime);
            dfvzVar.b = elapsedRealtime;
            dfvzVar.f = eofb.a.v();
            fgrc fgrcVar3 = dfvzVar.f;
            if (!fgrcVar3.b.L()) {
                fgrcVar3.U();
            }
            eofb eofbVar = (eofb) fgrcVar3.b;
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            }
            eofbVar.c = i2;
            eofbVar.b |= 1;
            if (!fgrcVar2.b.L()) {
                fgrcVar2.U();
            }
            eoff eoffVar = (eoff) fgrcVar2.b;
            eoffVar.e = i2;
            eoffVar.b |= 4;
            if (a == 6 && (fgrcVar = dfvzVar.f) != null) {
                dfvzVar.a.add((eofb) fgrcVar.Q());
                dfvzVar.f = null;
            }
        }
        if (i == 5) {
            if (this.p) {
                dfgj dfgjVar = this.k;
                atzb.s(dfgjVar);
                ((eaab) dfgjVar.j.lK()).b(Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
            }
            if (this.q) {
                this.r.c(true);
                this.r.b();
            }
            i = 5;
        }
        l.d("onAtvSetupUpdate: %d", Integer.valueOf(i));
        this.n = i;
        if (i == 1) {
            dfzy dfzyVar = new dfzy();
            dfzyVar.b = getString(R.string.smartdevice_atv_connecting_title);
            dfzyVar.c(getString(R.string.smartdevice_atv_connecting_description));
            dfzyVar.e = true;
            dfzyVar.a = 2131233220;
            dfzzVar = dfzyVar.a();
        } else if (i == 5) {
            dfzy dfzyVar2 = new dfzy();
            dfzyVar2.b = getString(R.string.smartdevice_atv_completed_title);
            dfzyVar2.c = getString(R.string.smartdevice_atv_completed_description);
            dfzyVar2.a = R.drawable.gs_celebration_vd_theme_40;
            dfzyVar2.e(getString(R.string.common_done), 2000);
            dfzzVar = dfzyVar2.a();
        }
        if (dfzzVar != null) {
            j(dfzzVar);
        }
    }

    @Override // defpackage.dfyy
    public final void c(int i, Bundle bundle) {
        if (i == 2000) {
            finishAndRemoveTask();
        } else {
            if (i != 2001) {
                throw new IllegalStateException(a.j(i, "Unknown action: "));
            }
            if (this.q) {
                this.r.c++;
            }
            k(this.h);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        atmr.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("deeplink");
        if (uri == null) {
            l.f("Deeplink URL is null", new Object[0]);
            finish();
            return;
        }
        eofc eofcVar = null;
        if (uri.toString().startsWith(fvak.l())) {
            l.h("Received QuickStart intent - launching QuickStart flow instead", new Object[0]);
            Intent intent2 = new Intent(intent);
            intent2.setAction("com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP");
            intent2.setComponent(null);
            intent2.setPackage("com.google.android.gms");
            startActivity(intent2);
            finish();
            return;
        }
        this.p = true;
        ModuleManager.BasicModuleInfo basicModuleInfo = ModuleManager.getBasicModuleInfo(this);
        if (basicModuleInfo != null) {
            this.j = basicModuleInfo.moduleVersion;
        }
        this.k = dfjk.a(this);
        this.q = fvay.c();
        this.r = new dfvz(this);
        if (this.q) {
            long a = dgys.a();
            fgrc fgrcVar = this.r.d;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eofi eofiVar = (eofi) fgrcVar.b;
            eofi eofiVar2 = eofi.a;
            eofiVar.b |= 1;
            eofiVar.c = a;
        }
        if (bundle != null) {
            if (bundle.containsKey("errorCode")) {
                a(bundle.getInt("errorCode"));
                return;
            } else if (bundle.containsKey("state")) {
                b(bundle.getInt("state"));
                return;
            }
        }
        if (this.p) {
            dfgj dfgjVar = this.k;
            atzb.s(dfgjVar);
            ((eaab) dfgjVar.h.lK()).b(Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
        }
        if (!"signin.google".equals(uri.getHost()) && !"smartlocktvsignin.google".equals(uri.getHost())) {
            if (uri.getHost() == null) {
                l.f("Deeplink URL has a null hostname", new Object[0]);
            } else {
                auad auadVar = l;
                String host = uri.getHost();
                atzb.s(host);
                auadVar.f("Deeplink URL contains unknown hostname: %s", host);
            }
            a(-11);
            return;
        }
        if (this.q) {
            String queryParameter = uri.getQueryParameter("vc");
            if (queryParameter != null) {
                try {
                    fgrc v = eofc.a.v();
                    long parseLong = Long.parseLong(queryParameter);
                    if (!v.b.L()) {
                        v.U();
                    }
                    eofc eofcVar2 = (eofc) v.b;
                    eofcVar2.b = 1 | eofcVar2.b;
                    eofcVar2.c = parseLong;
                    String queryParameter2 = uri.getQueryParameter("mfr");
                    if (queryParameter2 != null) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        eofc eofcVar3 = (eofc) v.b;
                        eofcVar3.b = 2 | eofcVar3.b;
                        eofcVar3.d = queryParameter2;
                    }
                    eofcVar = (eofc) v.Q();
                } catch (NumberFormatException e) {
                    l.g("Failed to parse target device info from URI", e, new Object[0]);
                }
            }
            if (eofcVar != null) {
                fgrc fgrcVar2 = this.r.e;
                if (!fgrcVar2.b.L()) {
                    fgrcVar2.U();
                }
                eoff eoffVar = (eoff) fgrcVar2.b;
                eoff eoffVar2 = eoff.a;
                eoffVar.i = eofcVar;
                eoffVar.b |= 16;
            }
        }
        String queryParameter3 = uri.getQueryParameter("ip");
        if (queryParameter3 == null) {
            fgrc fgrcVar3 = this.r.e;
            String uri2 = uri.toString();
            if (!fgrcVar3.b.L()) {
                fgrcVar3.U();
            }
            eoff eoffVar3 = (eoff) fgrcVar3.b;
            eoff eoffVar4 = eoff.a;
            uri2.getClass();
            eoffVar3.b |= 8;
            eoffVar3.h = uri2;
            a(-12);
            return;
        }
        try {
            InetAddress byName = InetAddress.getByName(queryParameter3);
            this.h = byName;
            if (!byName.isSiteLocalAddress()) {
                l.f("IP address is not a private (local) address", new Object[0]);
                a(-14);
                return;
            }
            String queryParameter4 = uri.getQueryParameter("key");
            if (queryParameter4 == null) {
                l.f("Deeplink URL is missing the 'key' parameter", new Object[0]);
                a(-15);
            } else {
                this.i = queryParameter4;
                k(this.h);
            }
        } catch (UnknownHostException unused) {
            l.f("QR code contains invalid IP address", new Object[0]);
            a(-13);
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        dfvz dfvzVar;
        super.onDestroy();
        dfqh dfqhVar = this.m;
        if (dfqhVar != null) {
            dfqhVar.a();
        }
        if (!this.q || (dfvzVar = this.r) == null) {
            return;
        }
        dfvzVar.b();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("state", this.n);
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("errorCode", num.intValue());
        }
        super.onSaveInstanceState(bundle);
    }
}
