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
import defpackage.arkc;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.bp;
import defpackage.dcve;
import defpackage.dcyf;
import defpackage.ddfa;
import defpackage.ddfc;
import defpackage.ddfg;
import defpackage.ddfh;
import defpackage.ddfi;
import defpackage.ddfj;
import defpackage.ddku;
import defpackage.ddnt;
import defpackage.ddnu;
import defpackage.ddot;
import defpackage.ddou;
import defpackage.denp;
import defpackage.denq;
import defpackage.denu;
import defpackage.dg;
import defpackage.dxob;
import defpackage.elrn;
import defpackage.elro;
import defpackage.elrq;
import defpackage.elrr;
import defpackage.elru;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fecy;
import defpackage.fsfn;
import defpackage.fsgb;
import defpackage.qex;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AtvSetupChimeraActivity extends qex implements ddnt, ddfa {
    private static final arxo l = new denq(new String[]{"AtvSetupActivity"});
    InetAddress h;
    String i;
    public int j = -1;
    public dcve k;
    private ddfc m;
    private int n;
    private Integer o;
    private boolean p;
    private boolean q;
    private ddku r;

    private final void j(dg dgVar) {
        bp bpVar = new bp(gI());
        bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
        bpVar.F(R.id.fragment_container, dgVar);
        bpVar.b();
    }

    private final void k(InetAddress inetAddress) {
        ddfc ddfcVar = this.m;
        if (ddfcVar != null) {
            ddfcVar.a();
        }
        arwm.s(inetAddress);
        String str = this.i;
        arwm.s(str);
        ddfc ddfcVar2 = new ddfc(this, inetAddress, str, this, this.r);
        this.m = ddfcVar2;
        final ddfj ddfjVar = ddfcVar2.c;
        denu.a();
        if (ddfjVar.e) {
            throw new IllegalStateException("Controller is already started!");
        }
        ddfjVar.e = true;
        ddfi ddfiVar = ddfjVar.c;
        denu.a();
        ddfc ddfcVar3 = (ddfc) ddfiVar;
        ddfcVar3.e = 1;
        ddfcVar3.d.b(1);
        ddfjVar.i = new ddfh(ddfiVar, Looper.getMainLooper());
        ensv ensvVar = ddfjVar.d;
        enss submit = ensvVar.submit(new Callable() { // from class: ddfe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                denq denqVar = ddfj.a;
                final ddfj ddfjVar2 = ddfj.this;
                InetAddress inetAddress2 = ddfjVar2.b;
                denqVar.d("Opening socket connection to %s:%d...", inetAddress2.getHostAddress(), 45454);
                InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress2, 45454);
                synchronized (ddfk.a) {
                }
                Socket socket = new Socket();
                socket.setTcpNoDelay(false);
                socket.setKeepAlive(true);
                ddfjVar2.f = socket;
                ddfjVar2.f.connect(inetSocketAddress, (int) fsgb.a.a().a());
                ddfjVar2.h = new DataOutputStream(ddfjVar2.f.getOutputStream());
                ddfjVar2.i.obtainMessage(2).sendToTarget();
                ddfjVar2.g = new demw(ddfjVar2.f.getInputStream(), new demv() { // from class: ddff
                    @Override // defpackage.demv
                    public final void a(byte[] bArr) {
                        ddfj.this.i.obtainMessage(1, bArr).sendToTarget();
                    }
                }, 1);
                ensv ensvVar2 = ddfjVar2.d;
                ensj.t(ensvVar2.submit(ddfjVar2.g), new ddfg(ddfjVar2), ensvVar2);
                return null;
            }
        });
        ensj.t(submit, new ddfg(ddfjVar), ensvVar);
        if (this.p) {
            ensj.t(submit, new ddnu(this), enre.a);
        }
    }

    @Override // defpackage.ddfa
    public final void a(int i) {
        int i2;
        int i3;
        if (this.q) {
            ddku ddkuVar = this.r;
            fecj fecjVar = ddkuVar.e;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            elrr elrrVar = (elrr) fecjVar.b;
            elrr elrrVar2 = elrr.a;
            fecy fecyVar = elrrVar.f;
            if (!fecyVar.c()) {
                elrrVar.f = fecp.C(fecyVar);
            }
            elrrVar.f.i(i);
            ddkuVar.a(SystemClock.elapsedRealtime());
            ddkuVar.f = null;
            this.r.c(false);
        }
        boolean z = true;
        if (this.p) {
            dcve dcveVar = this.k;
            arwm.s(dcveVar);
            ((dxob) dcveVar.k.a()).b(Integer.valueOf(i), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
        }
        arxo arxoVar = l;
        Integer valueOf = Integer.valueOf(i);
        arxoVar.f("onAtvSetupError: %d", valueOf);
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
        ddot ddotVar = new ddot();
        ddotVar.b = getString(i2);
        ddotVar.c = getString(i3);
        ddotVar.e = false;
        ddotVar.a = 2131233570;
        ddotVar.f(getString(R.string.common_cancel), 2000);
        if (z) {
            ddotVar.e(getString(R.string.common_try_again), 2001);
        }
        j(ddotVar.a());
    }

    @Override // defpackage.ddfa
    public final void b(int i) {
        fecj fecjVar;
        ddou ddouVar = null;
        if (this.q) {
            ddku ddkuVar = this.r;
            int a = elrq.a(i);
            fecj fecjVar2 = ddkuVar.e;
            int a2 = elrq.a(((elrr) fecjVar2.b).e);
            if (a2 != 0 && a2 == 6) {
                throw new IllegalStateException("Cannot change state once in the COMPLETED state");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ddkuVar.a(elapsedRealtime);
            ddkuVar.b = elapsedRealtime;
            ddkuVar.f = elrn.a.v();
            fecj fecjVar3 = ddkuVar.f;
            if (!fecjVar3.b.L()) {
                fecjVar3.U();
            }
            elrn elrnVar = (elrn) fecjVar3.b;
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            }
            elrnVar.c = i2;
            elrnVar.b |= 1;
            if (!fecjVar2.b.L()) {
                fecjVar2.U();
            }
            elrr elrrVar = (elrr) fecjVar2.b;
            elrrVar.e = i2;
            elrrVar.b |= 4;
            if (a == 6 && (fecjVar = ddkuVar.f) != null) {
                ddkuVar.a.add((elrn) fecjVar.Q());
                ddkuVar.f = null;
            }
        }
        if (i == 5) {
            if (this.p) {
                dcve dcveVar = this.k;
                arwm.s(dcveVar);
                ((dxob) dcveVar.j.a()).b(Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
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
            ddot ddotVar = new ddot();
            ddotVar.b = getString(R.string.smartdevice_atv_connecting_title);
            ddotVar.c(getString(R.string.smartdevice_atv_connecting_description));
            ddotVar.e = true;
            ddotVar.a = 2131233154;
            ddouVar = ddotVar.a();
        } else if (i == 5) {
            ddot ddotVar2 = new ddot();
            ddotVar2.b = getString(R.string.smartdevice_atv_completed_title);
            ddotVar2.c = getString(R.string.smartdevice_atv_completed_description);
            ddotVar2.a = R.drawable.gs_celebration_vd_theme_40;
            ddotVar2.e(getString(R.string.common_done), 2000);
            ddouVar = ddotVar2.a();
        }
        if (ddouVar != null) {
            j(ddouVar);
        }
    }

    @Override // defpackage.ddnt
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

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("deeplink");
        if (uri == null) {
            l.f("Deeplink URL is null", new Object[0]);
            finish();
            return;
        }
        elro elroVar = null;
        if (uri.toString().startsWith(fsfn.l())) {
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
        this.k = dcyf.a(this);
        this.q = fsgb.c();
        this.r = new ddku(this);
        if (this.q) {
            long a = denp.a();
            fecj fecjVar = this.r.d;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            elru elruVar = (elru) fecjVar.b;
            elru elruVar2 = elru.a;
            elruVar.b |= 1;
            elruVar.c = a;
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
            dcve dcveVar = this.k;
            arwm.s(dcveVar);
            ((dxob) dcveVar.h.a()).b(Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.j));
        }
        if (!"signin.google".equals(uri.getHost()) && !"smartlocktvsignin.google".equals(uri.getHost())) {
            if (uri.getHost() == null) {
                l.f("Deeplink URL has a null hostname", new Object[0]);
            } else {
                arxo arxoVar = l;
                String host = uri.getHost();
                arwm.s(host);
                arxoVar.f("Deeplink URL contains unknown hostname: %s", host);
            }
            a(-11);
            return;
        }
        if (this.q) {
            String queryParameter = uri.getQueryParameter("vc");
            if (queryParameter != null) {
                try {
                    fecj v = elro.a.v();
                    long parseLong = Long.parseLong(queryParameter);
                    if (!v.b.L()) {
                        v.U();
                    }
                    elro elroVar2 = (elro) v.b;
                    elroVar2.b = 1 | elroVar2.b;
                    elroVar2.c = parseLong;
                    String queryParameter2 = uri.getQueryParameter("mfr");
                    if (queryParameter2 != null) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        elro elroVar3 = (elro) v.b;
                        elroVar3.b = 2 | elroVar3.b;
                        elroVar3.d = queryParameter2;
                    }
                    elroVar = (elro) v.Q();
                } catch (NumberFormatException e) {
                    l.g("Failed to parse target device info from URI", e, new Object[0]);
                }
            }
            if (elroVar != null) {
                fecj fecjVar2 = this.r.e;
                if (!fecjVar2.b.L()) {
                    fecjVar2.U();
                }
                elrr elrrVar = (elrr) fecjVar2.b;
                elrr elrrVar2 = elrr.a;
                elrrVar.i = elroVar;
                elrrVar.b |= 16;
            }
        }
        String queryParameter3 = uri.getQueryParameter("ip");
        if (queryParameter3 == null) {
            if (fsgb.a.a().c()) {
                fecj fecjVar3 = this.r.e;
                String uri2 = uri.toString();
                if (!fecjVar3.b.L()) {
                    fecjVar3.U();
                }
                elrr elrrVar3 = (elrr) fecjVar3.b;
                elrr elrrVar4 = elrr.a;
                uri2.getClass();
                elrrVar3.b |= 8;
                elrrVar3.h = uri2;
            }
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

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        ddku ddkuVar;
        super.onDestroy();
        ddfc ddfcVar = this.m;
        if (ddfcVar != null) {
            ddfcVar.a();
        }
        if (!this.q || (ddkuVar = this.r) == null) {
            return;
        }
        ddkuVar.b();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("state", this.n);
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("errorCode", num.intValue());
        }
        super.onSaveInstanceState(bundle);
    }
}
