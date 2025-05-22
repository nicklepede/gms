package com.google.android.gms.threadnetwork.credentials;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.thread.ActiveOperationalDataset;
import android.net.thread.ThreadNetworkController;
import android.net.thread.ThreadNetworkManager;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.threadnetwork.ThreadBorderAgent;
import com.google.android.gms.threadnetwork.ThreadNetworkClientOptions;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.ThreadNetworkModuleInitIntentOperation;
import com.google.android.gms.threadnetwork.credentials.firstparty.BorderRouterSyncBoundService;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auua;
import defpackage.casd;
import defpackage.caso;
import defpackage.casv;
import defpackage.cata;
import defpackage.cate;
import defpackage.cbht;
import defpackage.dhsi;
import defpackage.dhsj;
import defpackage.dhvn;
import defpackage.dhwj;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgp;
import defpackage.fpuj;
import defpackage.fvhd;
import defpackage.fvhn;
import defpackage.iic;
import defpackage.iif;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ThreadNetworkModuleInitIntentOperation extends apzs {
    public static final ausn a = cbht.a("ThreadNetworkModuleInitIntentOperation");
    static final String b = auua.f("com.google.android.gms.threadnetwork#com.google.android.gms");

    public ThreadNetworkModuleInitIntentOperation() {
    }

    private final void e() {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11184)).B("Enable component %s", "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity");
        aura.H(this, "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity", true);
        if (!dhwj.f()) {
            casd.a(this).d("PeriodicBrSync", BorderRouterSyncBoundService.a);
            ((eluo) ((eluo) dhwj.a.h()).ai((char) 11210)).B("Cancelled periodic Border Router sync task: %s", "PeriodicBrSync");
        } else if (fpuj.a.lK().C()) {
            caso casoVar = new caso();
            casoVar.t("PeriodicBrSync");
            casoVar.w(BorderRouterSyncBoundService.a);
            casoVar.e(true);
            casoVar.a = casv.c((int) fvhd.a.lK().d());
            casoVar.v(2);
            casd.a(this).f(casoVar.b());
            ((eluo) ((eluo) dhwj.a.h()).ai((char) 11212)).B("Scheduled periodic Border Router sync task: %s", "PeriodicBrSync");
        } else {
            long e = fvhd.a.lK().e();
            cate cateVar = new cate();
            cateVar.t("PeriodicBrSync");
            cateVar.w(BorderRouterSyncBoundService.a);
            cateVar.y(0, 0);
            cateVar.x(0, 1);
            cateVar.j(cata.a(e));
            cateVar.v(2);
            casd.a(this).f(cateVar.b());
            ((eluo) ((eluo) dhwj.a.h()).ai((char) 11211)).B("Scheduled periodic Border Router sync task: %s", "PeriodicBrSync");
        }
        if (!fvhn.a.lK().G()) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 11185)).x("Skip joining preferred or random network: flag disabled");
            return;
        }
        final byte[] bArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        eqgp a2 = dhsj.a();
        ausn ausnVar2 = dhsi.a;
        final dhsi dhsiVar = null;
        if (getPackageManager().hasSystemFeature("android.hardware.thread_network")) {
            ThreadNetworkManager threadNetworkManager = (ThreadNetworkManager) getSystemService("thread_network");
            if (threadNetworkManager == null) {
                ((eluo) dhsi.a.i()).z("ThreadNetworkManager is null! (SdkLevel=%d)", Build.VERSION.SDK_INT);
            } else {
                List allThreadNetworkControllers = threadNetworkManager.getAllThreadNetworkControllers();
                if (allThreadNetworkControllers.isEmpty()) {
                    ((eluo) dhsi.a.i()).x("No ThreadNetworkController is available!");
                } else {
                    ThreadNetworkController threadNetworkController = (ThreadNetworkController) allThreadNetworkControllers.get(0);
                    ((eluo) dhsi.a.h()).z("Got ThreadNetworkController from system service, Thread Version = %d", threadNetworkController.getThreadVersion());
                    dhsiVar = new dhsi(threadNetworkController);
                }
            }
        } else {
            ((eluo) dhsi.a.i()).z("Platform does not support Thread Network Feature! (SdkLevel=%d)", Build.VERSION.SDK_INT);
        }
        if (dhsiVar == null) {
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11186)).x("Joining preferred or random network...");
        final ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        final ArrayList arrayList = new ArrayList();
        eqgc.t(eqdl.g(eqdl.f(eqdl.g(eqgb.h(iif.a(new iic() { // from class: dhvj
            @Override // defpackage.iic
            public final Object a(final iia iiaVar) {
                ausn ausnVar3 = ThreadNetworkModuleInitIntentOperation.a;
                final List list = arrayList;
                final ConnectivityManager connectivityManager2 = connectivityManager;
                NetworkCallbackWrapper networkCallbackWrapper = new NetworkCallbackWrapper() { // from class: com.google.android.gms.threadnetwork.credentials.ThreadNetworkModuleInitIntentOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("threadnetwork", "mobilecontroller");
                    }

                    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
                    public final void a(Network network) {
                        ((eluo) ((eluo) ThreadNetworkModuleInitIntentOperation.a.h()).ai((char) 11178)).x("Wi-Fi network connected");
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            connectivityManager2.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) list2.get(0));
                            list2.clear();
                        }
                        iiaVar.b(null);
                    }
                };
                list.add(networkCallbackWrapper);
                connectivityManager2.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), networkCallbackWrapper);
                return "ThreadNetworkModuleInitIntentOperation.waitForWifiNetwork";
            }
        })), new eqdv() { // from class: dhvk
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                dial dialVar = new dial(ThreadNetworkModuleInitIntentOperation.this, ThreadNetworkClientOptions.a);
                atfn atfnVar = new atfn();
                atfnVar.c = new Feature[]{dhra.a};
                atfnVar.a = new atfd() { // from class: diag
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        diam diamVar = (diam) obj2;
                        int i = dial.a;
                        ((diaa) diamVar.H()).c(new diaj((dhma) obj3), bsxa.a(diamVar.r));
                    }
                };
                atfnVar.d = 27003;
                return dqmr.b(dialVar.jd(atfnVar.a()));
            }
        }, a2), new ekut() { // from class: dhvl
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ThreadNetworkCredentials threadNetworkCredentials = ((dhro) obj).a;
                if (threadNetworkCredentials != null) {
                    return threadNetworkCredentials;
                }
                Parcelable.Creator creator = ThreadNetworkCredentials.CREATOR;
                Random random = new Random();
                SecureRandom secureRandom = new SecureRandom();
                elqn elqnVar = new elqn(ThreadNetworkCredentials.b);
                int nextInt = random.nextInt(16) + 11;
                dhrm dhrmVar = new dhrm();
                int nextInt2 = random.nextInt(65535);
                byte[] bArr2 = new byte[8];
                random.nextBytes(bArr2);
                String str = "ThreadNet-" + nextInt2;
                byte[] bArr3 = new byte[8];
                random.nextBytes(bArr3);
                bArr3[0] = -3;
                dhrl dhrlVar = ThreadNetworkCredentials.a;
                byte[] bArr4 = new byte[16];
                secureRandom.nextBytes(bArr4);
                byte[] bArr5 = new byte[16];
                secureRandom.nextBytes(bArr5);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(5);
                byteArrayOutputStream.write(16);
                byteArrayOutputStream.write(bArr4, 0, 16);
                byteArrayOutputStream.write(14);
                byte[] d = dhrmVar.d();
                byteArrayOutputStream.write(8);
                byteArrayOutputStream.write(d, 0, 8);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(3);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write((nextInt >> 8) & 255);
                byteArrayOutputStream.write(nextInt & 255);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                elsn listIterator = elqnVar.listIterator();
                while (listIterator.hasNext()) {
                    dhrk dhrkVar = (dhrk) listIterator.next();
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byteArrayOutputStream3.write(dhrkVar.a);
                    byte[] bArr6 = dhrkVar.b;
                    int length = bArr6.length;
                    byteArrayOutputStream3.write(length);
                    byteArrayOutputStream3.write(bArr6, 0, length);
                    byte[] byteArray = byteArrayOutputStream3.toByteArray();
                    byteArrayOutputStream2.write(byteArray, 0, byteArray.length);
                }
                byte[] bArr7 = bArr;
                ThreadNetworkModuleInitIntentOperation threadNetworkModuleInitIntentOperation = ThreadNetworkModuleInitIntentOperation.this;
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream.write(53);
                int length2 = byteArray2.length;
                byteArrayOutputStream.write(length2);
                byteArrayOutputStream.write(byteArray2, 0, length2);
                byteArrayOutputStream.write(2);
                byteArrayOutputStream.write(8);
                byteArrayOutputStream.write(bArr2, 0, 8);
                byteArrayOutputStream.write(3);
                byteArrayOutputStream.write(str.length());
                byteArrayOutputStream.write(str.getBytes(ThreadNetworkCredentials.c), 0, str.length());
                byteArrayOutputStream.write(7);
                byteArrayOutputStream.write(8);
                byteArrayOutputStream.write(bArr3, 0, 8);
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(2);
                byteArrayOutputStream.write((nextInt2 >> 8) & 255);
                byteArrayOutputStream.write(nextInt2 & 255);
                byteArrayOutputStream.write(4);
                byteArrayOutputStream.write(16);
                byteArrayOutputStream.write(bArr5, 0, 16);
                byteArrayOutputStream.write(12);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i = dhrlVar.a;
                byteArrayOutputStream4.write(i >> 8);
                byteArrayOutputStream4.write(i & 255);
                byte[] bArr8 = dhrlVar.b;
                byteArrayOutputStream4.write(bArr8, 0, bArr8.length);
                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                int length3 = byteArray3.length;
                byteArrayOutputStream.write(length3);
                byteArrayOutputStream.write(byteArray3, 0, length3);
                final ThreadNetworkCredentials threadNetworkCredentials2 = new ThreadNetworkCredentials(byteArrayOutputStream.toByteArray(), 0L, 0L, false);
                dial dialVar = new dial(threadNetworkModuleInitIntentOperation, ThreadNetworkClientOptions.a);
                atzb.d(true, "Invalid length of the ID (length = %d, expectedLength = %d)", 16, 16);
                final ThreadBorderAgent threadBorderAgent = new ThreadBorderAgent((byte[]) bArr7.clone());
                atfn atfnVar = new atfn();
                atfnVar.c = new Feature[]{dhra.a};
                atfnVar.a = new atfd() { // from class: diae
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        diam diamVar = (diam) obj2;
                        int i2 = dial.a;
                        diai diaiVar = new diai((dhma) obj3);
                        ((diaa) diamVar.H()).a(diaiVar, ThreadBorderAgent.this, threadNetworkCredentials2, bsxa.a(diamVar.r));
                    }
                };
                atfnVar.d = 27001;
                dialVar.jd(atfnVar.a());
                return threadNetworkCredentials2;
            }
        }, a2), new eqdv() { // from class: dhvm
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                ThreadNetworkCredentials threadNetworkCredentials = (ThreadNetworkCredentials) obj;
                ((eluo) ((eluo) ThreadNetworkModuleInitIntentOperation.a.h()).ai((char) 11181)).B("Joining network %s", threadNetworkCredentials);
                final ActiveOperationalDataset fromThreadTlvs = ActiveOperationalDataset.fromThreadTlvs(threadNetworkCredentials.a());
                final dhsi dhsiVar2 = (dhsi) dhsf.this;
                return iif.a(new iic() { // from class: dhsg
                    @Override // defpackage.iic
                    public final Object a(iia iiaVar) {
                        dhsh dhshVar = new dhsh(iiaVar);
                        dhsi dhsiVar3 = dhsi.this;
                        dhsiVar3.b.join(fromThreadTlvs, dhsiVar3.c, dhshVar);
                        return "AndroidThreadNetworkControllerImpl.join";
                    }
                });
            }
        }, a2), new dhvn(), a2);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ((eluo) ((eluo) a.h()).ai((char) 11183)).z("Initializing runtime states: %d", i);
        e();
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !b.equals(intent.getAction())) {
            super.onHandleIntent(intent);
        } else if ("com.google.android.gms.threadnetwork#com.google.android.gms".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((eluo) ((eluo) a.h()).ai((char) 11182)).x("phenotype flags updated");
            dxwx.f(dxxi.a("com.google.android.gms.threadnetwork#com.google.android.gms"));
            e();
        }
    }

    ThreadNetworkModuleInitIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
