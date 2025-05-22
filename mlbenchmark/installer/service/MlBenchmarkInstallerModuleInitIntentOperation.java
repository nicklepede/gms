package com.google.android.gms.mlbenchmark.installer.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mlbenchmark.installer.service.MlBenchmarkInstallerModuleInitIntentOperation;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auua;
import defpackage.cght;
import defpackage.cgia;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlv;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dkbl;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.eluo;
import defpackage.fszi;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MlBenchmarkInstallerModuleInitIntentOperation extends apzs {
    public static final ausn a = ausn.b("MlBenchmarkInstaller", auid.MLBENCHMARK_INSTALLER);

    public static String e(cght cghtVar) {
        return String.format("Chipset=%s, DeviceModel=%s, GpuName=%s, GpuVendor=%s", cghtVar.c, cghtVar.f, cghtVar.e, cghtVar.d);
    }

    static void f(final Context context) {
        dhlw f;
        final String str = new Feature("mlbenchmark", 1L).a;
        final cgia cgiaVar = new cgia();
        final ausn ausnVar = a;
        if (fszi.d()) {
            if (fszi.f() || fszi.e() || fszi.g()) {
                f = dkbl.a(context).aK().f(new dhlv() { // from class: cghx
                    @Override // defpackage.dhlv
                    public final dhlw a(Object obj) {
                        boolean q = ((atat) obj).q();
                        final ausn ausnVar2 = ausnVar;
                        ((eluo) ((eluo) ausnVar2.h()).ai((char) 6426)).B("Usage reporting opted in=%b", Boolean.valueOf(q));
                        if (!q) {
                            return dhmr.d(false);
                        }
                        final dqoa a2 = dqob.a();
                        aupz aupzVar = new aupz(1, 10);
                        fmjq fmjqVar = fmjq.a;
                        fgrc v = fmjqVar.v();
                        fgrc v2 = fmjk.a.v();
                        int i = Build.VERSION.SDK_INT;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fmjk fmjkVar = (fmjk) v2.b;
                        fmjkVar.b |= 1;
                        fmjkVar.c = i;
                        String str2 = Build.MANUFACTURER;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fmjk fmjkVar2 = (fmjk) v2.b;
                        str2.getClass();
                        fmjkVar2.b |= 2;
                        fmjkVar2.d = str2;
                        String str3 = Build.MODEL;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fmjk fmjkVar3 = (fmjk) v2.b;
                        str3.getClass();
                        fmjkVar3.b |= 4;
                        fmjkVar3.e = str3;
                        String str4 = Build.DEVICE;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar = v2.b;
                        fmjk fmjkVar4 = (fmjk) fgriVar;
                        str4.getClass();
                        fmjkVar4.b |= 8;
                        fmjkVar4.f = str4;
                        String str5 = a2.a;
                        if (!fgriVar.L()) {
                            v2.U();
                        }
                        fgri fgriVar2 = v2.b;
                        fmjk fmjkVar5 = (fmjk) fgriVar2;
                        str5.getClass();
                        fmjkVar5.b |= 32;
                        fmjkVar5.h = str5;
                        String str6 = a2.b;
                        if (!fgriVar2.L()) {
                            v2.U();
                        }
                        fmjk fmjkVar6 = (fmjk) v2.b;
                        str6.getClass();
                        fmjkVar6.b |= 16;
                        fmjkVar6.g = str6;
                        fmjk fmjkVar7 = (fmjk) v2.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fmjq fmjqVar2 = (fmjq) v.b;
                        fmjkVar7.getClass();
                        fgsa fgsaVar = fmjqVar2.b;
                        if (!fgsaVar.c()) {
                            fmjqVar2.b = fgri.E(fgsaVar);
                        }
                        fmjqVar2.b.add(fmjkVar7);
                        fgrc v3 = fmjj.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        ((fmjj) v3.b).b = "gpu_compatibility";
                        fmjj fmjjVar = (fmjj) v3.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fmjq fmjqVar3 = (fmjq) v.b;
                        fmjjVar.getClass();
                        fgsa fgsaVar2 = fmjqVar3.c;
                        if (!fgsaVar2.c()) {
                            fmjqVar3.c = fgri.E(fgsaVar2);
                        }
                        fmjqVar3.c.add(fmjjVar);
                        fmjq fmjqVar4 = (fmjq) v.Q();
                        CronetEngine cronetEngine = athr.a().getCronetEngine();
                        byte[] decode = Base64.decode("SGV5ISBXaHkncmUgeW91IHJlYWRpbmcgdGhpcz8", 3);
                        byte[] decode2 = Base64.decode("SOmjagB6tbAAPQ7cOv7rq1dqIPI7qQ1OKZGhJt4", 3);
                        byte[] bArr = new byte[decode.length];
                        for (int i2 = 0; i2 < decode.length; i2++) {
                            bArr[i2] = (byte) (decode[i2] ^ decode2[i2]);
                        }
                        String encodeToString = Base64.encodeToString(bArr, 3);
                        fwsy fwsyVar = new fwsy();
                        fwsn fwsnVar = fwsy.c;
                        int i3 = fwst.d;
                        fwsyVar.h(new fwsm("X-Goog-Api-Key", fwsnVar), encodeToString);
                        fwxh i4 = fwxh.i("mobilemlaccelerationcompatibility.googleapis.com", 443, cronetEngine);
                        i4.f(new fxoc(fwsyVar));
                        i4.h(1L, TimeUnit.MINUTES);
                        final fwsc a3 = i4.a();
                        fmjm fmjmVar = (fmjm) fmjm.f(new fmjl(), a3);
                        fwpk fwpkVar = fmjmVar.a;
                        fwtc fwtcVar = fmjn.a;
                        if (fwtcVar == null) {
                            synchronized (fmjn.class) {
                                fwtcVar = fmjn.a;
                                if (fwtcVar == null) {
                                    fwsz a4 = fwtc.a();
                                    a4.c = fwtb.UNARY;
                                    a4.d = fwtc.c("google.mobile.mlaccelerationcompatibility.v1.CompatibilityService", "FetchDevicesCompatibility");
                                    a4.b();
                                    fgqp fgqpVar = fxnm.a;
                                    a4.a = new fxnl(fmjqVar);
                                    a4.b = new fxnl(fmjr.a);
                                    fwtc a5 = a4.a();
                                    fmjn.a = a5;
                                    fwtcVar = a5;
                                }
                            }
                        }
                        final Context context2 = context;
                        final cgia cgiaVar2 = cgia.this;
                        return dqml.a(ejaa.g(fxnz.a(fwpkVar.a(fwtcVar, fmjmVar.b), fmjqVar4)).h(new ekut() { // from class: evlj
                            @Override // defpackage.ekut
                            public final Object apply(Object obj2) {
                                fwsc fwscVar = fwsc.this;
                                fmjr fmjrVar = (fmjr) obj2;
                                try {
                                    fwscVar.d();
                                    fwscVar.h(1L, TimeUnit.SECONDS);
                                    return fmjrVar;
                                } catch (InterruptedException e) {
                                    throw new IllegalStateException("Interrupted while terminating the channel.", e);
                                }
                            }
                        }, aupzVar)).f(new dhlv() { // from class: cghz
                            @Override // defpackage.dhlv
                            public final dhlw a(Object obj2) {
                                evlg evlgVar;
                                int i5 = ((fmjo) ((fmjp) ((fmjr) obj2).b.get(0)).b.get(0)).b;
                                int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 5 : 4 : 3 : 2;
                                if (i6 == 0) {
                                    i6 = 1;
                                }
                                int i7 = i6 - 2;
                                if (i7 == 1) {
                                    evlgVar = evlg.UNSUPPORTED;
                                } else if (i7 == 2) {
                                    evlgVar = evlg.SUPPORTED;
                                } else {
                                    if (i7 != 3) {
                                        if (i6 == 1) {
                                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                                        }
                                        throw new IllegalArgumentException(String.format("Unexpected compatibility state returned from RPC server: %d", Integer.valueOf(i7)));
                                    }
                                    evlgVar = evlg.UNKNOWN;
                                }
                                return dhmr.d(evlgVar);
                            }
                        }).f(new dhlv() { // from class: cghw
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0194  */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x01a8 A[LOOP:0: B:12:0x006b->B:31:0x01a8, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x01bf A[SYNTHETIC] */
                            @Override // defpackage.dhlv
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.dhlw a(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 458
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.cghw.a(java.lang.Object):dhlw");
                            }
                        });
                    }
                });
                f.y(new dhln() { // from class: cghy
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        ((eluo) ((eluo) ((eluo) ausn.this.j()).s(exc)).ai((char) 6429)).x("Failed to check if module is needed, task exception.");
                    }
                });
            } else {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 6424)).x("Device sampled out, skipping.");
                f = dhmr.d(false);
            }
        } else if (fszi.a.lK().d()) {
            f = dkbl.a(context).aK().f(new dhlv() { // from class: cghu
                @Override // defpackage.dhlv
                public final dhlw a(Object obj) {
                    boolean q = ((atat) obj).q();
                    ausn ausnVar2 = ausn.this;
                    ((eluo) ((eluo) ausnVar2.h()).ai((char) 6430)).B("Usage reporting opted in=%b", Boolean.valueOf(q));
                    if (!q) {
                        return dhmr.d(false);
                    }
                    Context context2 = context;
                    dqoa a2 = dqob.a();
                    InputStream open = context2.getAssets().open("mobile_acceleration/gpu_compatibility.bin");
                    try {
                        byte[] bArr = new byte[open.available()];
                        int i = 0;
                        while (true) {
                            int length = bArr.length;
                            int read = open.read(bArr, i, length - i);
                            if (read <= 0) {
                                break;
                            }
                            i += read;
                            int available = open.available();
                            if (available > length - i) {
                                byte[] bArr2 = new byte[available + i];
                                System.arraycopy(bArr, 0, bArr2, 0, i);
                                bArr = bArr2;
                            }
                        }
                        if (open != null) {
                            open.close();
                        }
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        etlg etlgVar = new etlg();
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        etlgVar.__reset(wrap.getInt(wrap.position()) + wrap.position(), wrap);
                        int i2 = Build.VERSION.SDK_INT;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        String sb2 = sb.toString();
                        String str2 = Build.MODEL;
                        if (str2 == null) {
                            throw new NullPointerException("Null model");
                        }
                        String str3 = Build.DEVICE;
                        if (str3 == null) {
                            throw new NullPointerException("Null device");
                        }
                        String str4 = Build.MANUFACTURER;
                        if (str4 == null) {
                            throw new NullPointerException("Null manufacturer");
                        }
                        evlf evlfVar = new evlf(sb2, str2, str3, str4);
                        String str5 = a2.a;
                        if (str5 == null) {
                            throw new NullPointerException("Null rendererName");
                        }
                        evlh evlhVar = new evlh(str5, a2.c, a2.d);
                        HashMap hashMap = new HashMap();
                        hashMap.put("tflite.android_sdk_version", evlfVar.a);
                        hashMap.put("tflite.device_model", evlfVar.b);
                        hashMap.put("tflite.device_name", evlfVar.c);
                        hashMap.put("tflite.manufacturer", evlfVar.d);
                        hashMap.put("tflite.gpu_model", evlhVar.a);
                        int i3 = evlhVar.b;
                        int i4 = evlhVar.c;
                        hashMap.put("tflite.opengl_es_version", Integer.toString(i3, 10) + "." + Integer.toString(i4, 10));
                        for (Map.Entry entry : hashMap.entrySet()) {
                            String c = ekti.c(((String) entry.getValue()).replaceAll("[ -]", "_"));
                            if (((String) entry.getKey()).equals("tflite.gpu_model")) {
                                c = evli.a.matcher(c).replaceAll("$1");
                            }
                            entry.setValue(c);
                        }
                        int i5 = 0;
                        while (true) {
                            int __offset = etlgVar.__offset(4);
                            if (i5 >= (__offset != 0 ? etlgVar.__vector_len(__offset) : 0)) {
                                break;
                            }
                            etlg etlgVar2 = new etlg();
                            int __offset2 = etlgVar.__offset(4);
                            if (__offset2 != 0) {
                                etlgVar2.__reset(etlgVar.__indirect(etlgVar.__vector(__offset2) + (i5 * 4)), etlgVar.bb);
                            } else {
                                etlgVar2 = null;
                            }
                            evle.a(etlgVar2, hashMap);
                            i5++;
                        }
                        String str6 = (String) hashMap.get("tflite.gpu.status");
                        evlg evlgVar = str6 == null ? evlg.UNKNOWN : str6.equals("SUPPORTED") ? evlg.SUPPORTED : evlg.UNSUPPORTED;
                        boolean h = fszi.a.lK().h();
                        boolean z = evlgVar == (h ? evlg.UNKNOWN : evlg.SUPPORTED);
                        eluo eluoVar = (eluo) ((eluo) ausnVar2.h()).ai(6431);
                        Boolean valueOf = Boolean.valueOf(z);
                        eluoVar.T("Device targeted=%b (target-unknown=%b, compatibility=%s)", valueOf, Boolean.valueOf(h), evlgVar);
                        return dhmr.d(valueOf);
                    } catch (Throwable th) {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            });
            f.y(new dhln() { // from class: cghv
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    ((eluo) ((eluo) ((eluo) ausn.this.j()).s(exc)).ai((char) 6432)).x("Failed to check if module is needed, task exception.");
                }
            });
        } else {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 6425)).x("Device sampled out, skipping.");
            f = dhmr.d(false);
        }
        f.z(new dhlq() { // from class: cgif
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                ausn ausnVar2 = MlBenchmarkInstallerModuleInitIntentOperation.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                Context context2 = context;
                if (!booleanValue) {
                    ModuleManager moduleManager = ModuleManager.get(context2);
                    ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                    featureRequest.unrequestFeature(str2);
                    boolean requestFeatures = moduleManager.requestFeatures(featureRequest);
                    ((eluo) ((eluo) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ai((char) 6439)).B("Feature unrequest success = %b", Boolean.valueOf(requestFeatures));
                    return;
                }
                ModuleManager moduleManager2 = ModuleManager.get(context2);
                ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
                featureCheck.checkFeatureAtVersion("mlbenchmark", 1L);
                int checkFeaturesAreAvailable = moduleManager2.checkFeaturesAreAvailable(featureCheck);
                if (checkFeaturesAreAvailable == 0) {
                    ((eluo) ((eluo) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ai((char) 6438)).x("Feature check success: module is already available on device");
                } else {
                    if (checkFeaturesAreAvailable != 2) {
                        ((eluo) ((eluo) MlBenchmarkInstallerModuleInitIntentOperation.a.j()).ai((char) 6435)).z("Feature check failure: %d", checkFeaturesAreAvailable);
                        return;
                    }
                    ((eluo) ((eluo) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ai((char) 6436)).x("Feature check success: module requires installation or update");
                }
                ModuleManager moduleManager3 = ModuleManager.get(context2);
                ModuleManager.FeatureRequest featureRequest2 = new ModuleManager.FeatureRequest();
                featureRequest2.requestFeatureAtAnyVersion(str2);
                boolean requestFeatures2 = moduleManager3.requestFeatures(featureRequest2);
                ((eluo) ((eluo) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ai((char) 6437)).B("Feature request success = %b", Boolean.valueOf(requestFeatures2));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:13|(2:17|(16:19|(1:21)|22|(1:24)|25|(1:27)|28|29|30|(1:32)|33|(1:35)|36|37|(1:39)(1:41)|40))|45|46|47|48|(2:49|(1:51)(1:52))|53|54|(2:55|(3:57|(2:59|(2:61|62)(4:64|(2:65|(2:67|(2:70|71)(1:69))(1:79))|72|(2:74|75)(1:78)))(1:80)|63)(3:81|82|(1:(3:84|(2:86|(2:88|89)(2:91|(2:93|94)(1:95)))(1:96)|90)(2:97|98))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:3|(2:4|(2:6|(2:9|10)(1:8))(2:112|113))|11|(10:13|(2:17|(16:19|(1:21)|22|(1:24)|25|(1:27)|28|29|30|(1:32)|33|(1:35)|36|37|(1:39)(1:41)|40))|45|46|47|48|(2:49|(1:51)(1:52))|53|54|(2:55|(3:57|(2:59|(2:61|62)(4:64|(2:65|(2:67|(2:70|71)(1:69))(1:79))|72|(2:74|75)(1:78)))(1:80)|63)(3:81|82|(1:(3:84|(2:86|(2:88|89)(2:91|(2:93|94)(1:95)))(1:96)|90)(2:97|98)))))|111|(0)|22|(0)|25|(0)|28|29|30|(0)|33|(0)|36|37|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0147, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0148, code lost:
    
        ((defpackage.eluo) ((defpackage.eluo) defpackage.cuif.a.j()).s(r13)).B("Unable to read %s", defpackage.cuif.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d5, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d6, code lost:
    
        r3 = (defpackage.eluo) ((defpackage.eluo) com.google.android.gms.mlbenchmark.installer.service.MlBenchmarkInstallerModuleInitIntentOperation.a.j()).ai(6444);
        r13 = r13.a;
        r3.G("Failed to get GPU info, EGL error %d: %s", r13, android.opengl.GLUtils.getEGLErrorString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
    
        if (r13 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
    
        ((defpackage.eluo) defpackage.cuif.a.j()).x("Unknown chipset!");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a8 A[Catch: dqnz -> 0x01d5, TryCatch #2 {dqnz -> 0x01d5, blocks: (B:30:0x019a, B:32:0x01a8, B:33:0x01ab, B:35:0x01c2, B:36:0x01c5), top: B:29:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2 A[Catch: dqnz -> 0x01d5, TryCatch #2 {dqnz -> 0x01d5, blocks: (B:30:0x019a, B:32:0x01a8, B:33:0x01ab, B:35:0x01c2, B:36:0x01c5), top: B:29:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0264  */
    @Override // defpackage.apzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b(android.content.Intent r12, int r13) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mlbenchmark.installer.service.MlBenchmarkInstallerModuleInitIntentOperation.b(android.content.Intent, int):void");
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 6440)).B("Intent: %s", action);
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !auua.f("com.google.android.gms.mlbenchmark#com.google.android.gms").equals(action)) {
            super.onHandleIntent(intent);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        ((eluo) ((eluo) ausnVar.h()).ai((char) 6441)).B("COMMITTED Extra package name: %s", stringExtra);
        if ("com.google.android.gms.mlbenchmark#com.google.android.gms".equals(stringExtra)) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 6442)).x("Phenotype configuration committed.");
            dxwx.f(dxxi.a("com.google.android.gms.mlbenchmark#com.google.android.gms"));
            f(getApplicationContext());
        }
    }
}
