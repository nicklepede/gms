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
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.threadnetwork.ThreadBorderAgent;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.ThreadNetworkModuleInitIntentOperation;
import com.google.android.gms.threadnetwork.credentials.firstparty.BorderRouterSyncBoundService;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqg;
import defpackage.byjl;
import defpackage.byjw;
import defpackage.bykd;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byzc;
import defpackage.dfha;
import defpackage.dfhb;
import defpackage.dfkf;
import defpackage.dfle;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensw;
import defpackage.fnck;
import defpackage.fslv;
import defpackage.fsmf;
import defpackage.igm;
import defpackage.igp;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ThreadNetworkModuleInitIntentOperation extends anya {
    public static final asot a = byzc.a("ThreadNetworkModuleInitIntentOperation");
    static final String b = asqg.f("com.google.android.gms.threadnetwork#com.google.android.gms");

    public ThreadNetworkModuleInitIntentOperation() {
    }

    private final void e() {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11179)).B("Enable component %s", "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity");
        asng.H(this, "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity", true);
        if (!dfle.g()) {
            byjl.a(this).d("PeriodicBrSync", BorderRouterSyncBoundService.a);
            ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11208)).B("Cancelled periodic Border Router sync task: %s", "PeriodicBrSync");
        } else if (fnck.a.a().C()) {
            byjw byjwVar = new byjw();
            byjwVar.t("PeriodicBrSync");
            byjwVar.w(BorderRouterSyncBoundService.a);
            byjwVar.e(true);
            byjwVar.a = bykd.c((int) fslv.a.a().d());
            byjwVar.v(2);
            byjl.a(this).f(byjwVar.b());
            ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11210)).B("Scheduled periodic Border Router sync task: %s", "PeriodicBrSync");
        } else {
            long e = fslv.a.a().e();
            bykm bykmVar = new bykm();
            bykmVar.t("PeriodicBrSync");
            bykmVar.w(BorderRouterSyncBoundService.a);
            bykmVar.y(0, 0);
            bykmVar.x(0, 1);
            bykmVar.j(byki.a(e));
            bykmVar.v(2);
            byjl.a(this).f(bykmVar.b());
            ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11209)).B("Scheduled periodic Border Router sync task: %s", "PeriodicBrSync");
        }
        if (!fsmf.a.a().G()) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 11180)).x("Skip joining preferred or random network: flag disabled");
            return;
        }
        final byte[] bArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ensw a2 = dfhb.a();
        asot asotVar2 = dfha.a;
        final dfha dfhaVar = null;
        if (getPackageManager().hasSystemFeature("android.hardware.thread_network")) {
            ThreadNetworkManager threadNetworkManager = (ThreadNetworkManager) getSystemService("thread_network");
            if (threadNetworkManager == null) {
                ((ejhf) dfha.a.i()).z("ThreadNetworkManager is null! (SdkLevel=%d)", Build.VERSION.SDK_INT);
            } else {
                List allThreadNetworkControllers = threadNetworkManager.getAllThreadNetworkControllers();
                if (allThreadNetworkControllers.isEmpty()) {
                    ((ejhf) dfha.a.i()).x("No ThreadNetworkController is available!");
                } else {
                    ThreadNetworkController threadNetworkController = (ThreadNetworkController) allThreadNetworkControllers.get(0);
                    ((ejhf) dfha.a.h()).z("Got ThreadNetworkController from system service, Thread Version = %d", threadNetworkController.getThreadVersion());
                    dfhaVar = new dfha(threadNetworkController);
                }
            }
        } else {
            ((ejhf) dfha.a.i()).z("Platform does not support Thread Network Feature! (SdkLevel=%d)", Build.VERSION.SDK_INT);
        }
        if (dfhaVar == null) {
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 11181)).x("Joining preferred or random network...");
        final ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        final ArrayList arrayList = new ArrayList();
        ensj.t(enps.g(enps.f(enps.g(ensi.h(igp.a(new igm() { // from class: dfkb
            @Override // defpackage.igm
            public final Object a(final igk igkVar) {
                asot asotVar3 = ThreadNetworkModuleInitIntentOperation.a;
                final List list = arrayList;
                final ConnectivityManager connectivityManager2 = connectivityManager;
                NetworkCallbackWrapper networkCallbackWrapper = new NetworkCallbackWrapper() { // from class: com.google.android.gms.threadnetwork.credentials.ThreadNetworkModuleInitIntentOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("threadnetwork", "mobilecontroller");
                    }

                    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
                    public final void a(Network network) {
                        ((ejhf) ((ejhf) ThreadNetworkModuleInitIntentOperation.a.h()).ah((char) 11173)).x("Wi-Fi network connected");
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            connectivityManager2.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) list2.get(0));
                            list2.clear();
                        }
                        igkVar.b(null);
                    }
                };
                list.add(networkCallbackWrapper);
                connectivityManager2.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), networkCallbackWrapper);
                return "ThreadNetworkModuleInitIntentOperation.waitForWifiNetwork";
            }
        })), new enqc() { // from class: dfkc
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                dfpg dfpgVar = new dfpg(ThreadNetworkModuleInitIntentOperation.this);
                arcy arcyVar = new arcy();
                arcyVar.c = new Feature[]{dffv.a};
                arcyVar.a = new arco() { // from class: dfpb
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        dfph dfphVar = (dfph) obj2;
                        int i = dfpg.a;
                        dfpe dfpeVar = new dfpe((dfau) obj3);
                        Context context = dfphVar.r;
                        ((dfov) dfphVar.H()).c(dfpeVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    }
                };
                arcyVar.d = 27003;
                return doci.b(dfpgVar.iO(arcyVar.a()));
            }
        }, a2), new eiho() { // from class: dfkd
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ThreadNetworkCredentials threadNetworkCredentials = ((dfgg) obj).a;
                if (threadNetworkCredentials != null) {
                    return threadNetworkCredentials;
                }
                Parcelable.Creator creator = ThreadNetworkCredentials.CREATOR;
                Random random = new Random();
                SecureRandom secureRandom = new SecureRandom();
                ejdg ejdgVar = new ejdg(ThreadNetworkCredentials.b);
                int nextInt = random.nextInt(16) + 11;
                dfge dfgeVar = new dfge();
                int nextInt2 = random.nextInt(65535);
                byte[] bArr2 = new byte[8];
                random.nextBytes(bArr2);
                String str = "ThreadNet-" + nextInt2;
                byte[] bArr3 = new byte[8];
                random.nextBytes(bArr3);
                bArr3[0] = -3;
                dfgd dfgdVar = ThreadNetworkCredentials.a;
                byte[] bArr4 = new byte[16];
                secureRandom.nextBytes(bArr4);
                byte[] bArr5 = new byte[16];
                secureRandom.nextBytes(bArr5);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(5);
                byteArrayOutputStream.write(16);
                byteArrayOutputStream.write(bArr4, 0, 16);
                byteArrayOutputStream.write(14);
                byte[] d = dfgeVar.d();
                byteArrayOutputStream.write(8);
                byteArrayOutputStream.write(d, 0, 8);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(3);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write((nextInt >> 8) & 255);
                byteArrayOutputStream.write(nextInt & 255);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ejfg listIterator = ejdgVar.listIterator();
                while (listIterator.hasNext()) {
                    dfgc dfgcVar = (dfgc) listIterator.next();
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byteArrayOutputStream3.write(dfgcVar.a);
                    byte[] bArr6 = dfgcVar.b;
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
                int i = dfgdVar.a;
                byteArrayOutputStream4.write(i >> 8);
                byteArrayOutputStream4.write(i & 255);
                byte[] bArr8 = dfgdVar.b;
                byteArrayOutputStream4.write(bArr8, 0, bArr8.length);
                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                int length3 = byteArray3.length;
                byteArrayOutputStream.write(length3);
                byteArrayOutputStream.write(byteArray3, 0, length3);
                final ThreadNetworkCredentials threadNetworkCredentials2 = new ThreadNetworkCredentials(byteArrayOutputStream.toByteArray(), 0L, 0L, false);
                dfpg dfpgVar = new dfpg(threadNetworkModuleInitIntentOperation);
                arwm.d(true, "Invalid length of the ID (length = %d, expectedLength = %d)", 16, 16);
                final ThreadBorderAgent threadBorderAgent = new ThreadBorderAgent((byte[]) bArr7.clone());
                arcy arcyVar = new arcy();
                arcyVar.c = new Feature[]{dffv.a};
                arcyVar.a = new arco() { // from class: dfoz
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        dfph dfphVar = (dfph) obj2;
                        int i2 = dfpg.a;
                        dfpd dfpdVar = new dfpd((dfau) obj3);
                        Context context = dfphVar.r;
                        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                        ((dfov) dfphVar.H()).a(dfpdVar, ThreadBorderAgent.this, threadNetworkCredentials2, new ApiMetadata(complianceOptions));
                    }
                };
                arcyVar.d = 27001;
                dfpgVar.iO(arcyVar.a());
                return threadNetworkCredentials2;
            }
        }, a2), new enqc() { // from class: dfke
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                ThreadNetworkCredentials threadNetworkCredentials = (ThreadNetworkCredentials) obj;
                ((ejhf) ((ejhf) ThreadNetworkModuleInitIntentOperation.a.h()).ah((char) 11176)).B("Joining network %s", threadNetworkCredentials);
                final ActiveOperationalDataset fromThreadTlvs = ActiveOperationalDataset.fromThreadTlvs(threadNetworkCredentials.a());
                final dfha dfhaVar2 = (dfha) dfgx.this;
                return igp.a(new igm() { // from class: dfgy
                    @Override // defpackage.igm
                    public final Object a(igk igkVar) {
                        dfgz dfgzVar = new dfgz(igkVar);
                        dfha dfhaVar3 = dfha.this;
                        dfhaVar3.b.join(fromThreadTlvs, dfhaVar3.c, dfgzVar);
                        return "AndroidThreadNetworkControllerImpl.join";
                    }
                });
            }
        }, a2), new dfkf(), a2);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        ((ejhf) ((ejhf) a.h()).ah((char) 11178)).z("Initializing runtime states: %d", i);
        e();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !b.equals(intent.getAction())) {
            super.onHandleIntent(intent);
        } else if ("com.google.android.gms.threadnetwork#com.google.android.gms".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((ejhf) ((ejhf) a.h()).ah((char) 11177)).x("phenotype flags updated");
            dvlw.f(dvmh.a("com.google.android.gms.threadnetwork#com.google.android.gms"));
            e();
        }
    }

    ThreadNetworkModuleInitIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
