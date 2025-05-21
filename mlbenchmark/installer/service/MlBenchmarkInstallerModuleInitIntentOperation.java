package com.google.android.gms.mlbenchmark.installer.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mlbenchmark.installer.service.MlBenchmarkInstallerModuleInitIntentOperation;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqg;
import defpackage.cdym;
import defpackage.cdyt;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfap;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dhqf;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.ejhf;
import defpackage.fqfq;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MlBenchmarkInstallerModuleInitIntentOperation extends anya {
    public static final asot a = asot.b("MlBenchmarkInstaller", asej.MLBENCHMARK_INSTALLER);

    public static String e(cdym cdymVar) {
        return String.format("Chipset=%s, DeviceModel=%s, GpuName=%s, GpuVendor=%s", cdymVar.c, cdymVar.f, cdymVar.e, cdymVar.d);
    }

    static void f(final Context context) {
        dfaq f;
        final String str = new Feature("mlbenchmark", 1L).a;
        final cdyt cdytVar = new cdyt();
        final asot asotVar = a;
        if (fqfq.d()) {
            if (fqfq.f() || fqfq.e() || fqfq.g()) {
                f = dhqf.a(context).aL().f(new dfap() { // from class: cdyq
                    @Override // defpackage.dfap
                    public final dfaq a(Object obj) {
                        boolean r = ((aqye) obj).r();
                        final asot asotVar2 = asotVar;
                        ((ejhf) ((ejhf) asotVar2.h()).ah((char) 6407)).B("Usage reporting opted in=%b", Boolean.valueOf(r));
                        if (!r) {
                            return dfbl.d(false);
                        }
                        final dodr a2 = dods.a();
                        asmf asmfVar = new asmf(1, 10);
                        fjtt fjttVar = fjtt.a;
                        fecj v = fjttVar.v();
                        fecj v2 = fjtn.a.v();
                        int i = Build.VERSION.SDK_INT;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fjtn fjtnVar = (fjtn) v2.b;
                        fjtnVar.b |= 1;
                        fjtnVar.c = i;
                        String str2 = Build.MANUFACTURER;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fjtn fjtnVar2 = (fjtn) v2.b;
                        str2.getClass();
                        fjtnVar2.b |= 2;
                        fjtnVar2.d = str2;
                        String str3 = Build.MODEL;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fjtn fjtnVar3 = (fjtn) v2.b;
                        str3.getClass();
                        fjtnVar3.b |= 4;
                        fjtnVar3.e = str3;
                        String str4 = Build.DEVICE;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar = v2.b;
                        fjtn fjtnVar4 = (fjtn) fecpVar;
                        str4.getClass();
                        fjtnVar4.b |= 8;
                        fjtnVar4.f = str4;
                        String str5 = a2.a;
                        if (!fecpVar.L()) {
                            v2.U();
                        }
                        fecp fecpVar2 = v2.b;
                        fjtn fjtnVar5 = (fjtn) fecpVar2;
                        str5.getClass();
                        fjtnVar5.b |= 32;
                        fjtnVar5.h = str5;
                        String str6 = a2.b;
                        if (!fecpVar2.L()) {
                            v2.U();
                        }
                        fjtn fjtnVar6 = (fjtn) v2.b;
                        str6.getClass();
                        fjtnVar6.b |= 16;
                        fjtnVar6.g = str6;
                        fjtn fjtnVar7 = (fjtn) v2.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fjtt fjttVar2 = (fjtt) v.b;
                        fjtnVar7.getClass();
                        fedh fedhVar = fjttVar2.b;
                        if (!fedhVar.c()) {
                            fjttVar2.b = fecp.E(fedhVar);
                        }
                        fjttVar2.b.add(fjtnVar7);
                        fecj v3 = fjtm.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        ((fjtm) v3.b).b = "gpu_compatibility";
                        fjtm fjtmVar = (fjtm) v3.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fjtt fjttVar3 = (fjtt) v.b;
                        fjtmVar.getClass();
                        fedh fedhVar2 = fjttVar3.c;
                        if (!fedhVar2.c()) {
                            fjttVar3.c = fecp.E(fedhVar2);
                        }
                        fjttVar3.c.add(fjtmVar);
                        fjtt fjttVar4 = (fjtt) v.Q();
                        CronetEngine cronetEngine = arfc.a().getCronetEngine();
                        byte[] decode = Base64.decode("SGV5ISBXaHkncmUgeW91IHJlYWRpbmcgdGhpcz8", 3);
                        byte[] decode2 = Base64.decode("SOmjagB6tbAAPQ7cOv7rq1dqIPI7qQ1OKZGhJt4", 3);
                        byte[] bArr = new byte[decode.length];
                        for (int i2 = 0; i2 < decode.length; i2++) {
                            bArr[i2] = (byte) (decode[i2] ^ decode2[i2]);
                        }
                        String encodeToString = Base64.encodeToString(bArr, 3);
                        ftxa ftxaVar = new ftxa();
                        ftwp ftwpVar = ftxa.c;
                        int i3 = ftwv.d;
                        ftxaVar.h(new ftwo("X-Goog-Api-Key", ftwpVar), encodeToString);
                        fubj i4 = fubj.i("mobilemlaccelerationcompatibility.googleapis.com", 443, cronetEngine);
                        i4.f(new fuse(ftxaVar));
                        i4.h(1L, TimeUnit.MINUTES);
                        final ftwe a3 = i4.a();
                        fjtp fjtpVar = (fjtp) fjtp.f(new fjto(), a3);
                        fttm fttmVar = fjtpVar.a;
                        ftxe ftxeVar = fjtq.a;
                        if (ftxeVar == null) {
                            synchronized (fjtq.class) {
                                ftxeVar = fjtq.a;
                                if (ftxeVar == null) {
                                    ftxb a4 = ftxe.a();
                                    a4.c = ftxd.UNARY;
                                    a4.d = ftxe.c("google.mobile.mlaccelerationcompatibility.v1.CompatibilityService", "FetchDevicesCompatibility");
                                    a4.b();
                                    febw febwVar = furo.a;
                                    a4.a = new furn(fjttVar);
                                    a4.b = new furn(fjtu.a);
                                    ftxe a5 = a4.a();
                                    fjtq.a = a5;
                                    ftxeVar = a5;
                                }
                            }
                        }
                        final Context context2 = context;
                        final cdyt cdytVar2 = cdyt.this;
                        return docc.a(egmx.f(fusb.a(fttmVar.a(ftxeVar, fjtpVar.b), fjttVar4)).h(new eiho() { // from class: esvt
                            @Override // defpackage.eiho
                            public final Object apply(Object obj2) {
                                ftwe ftweVar = ftwe.this;
                                fjtu fjtuVar = (fjtu) obj2;
                                try {
                                    ftweVar.d();
                                    ftweVar.h(1L, TimeUnit.SECONDS);
                                    return fjtuVar;
                                } catch (InterruptedException e) {
                                    throw new IllegalStateException("Interrupted while terminating the channel.", e);
                                }
                            }
                        }, asmfVar)).f(new dfap() { // from class: cdys
                            @Override // defpackage.dfap
                            public final dfaq a(Object obj2) {
                                esvq esvqVar;
                                int i5 = ((fjtr) ((fjts) ((fjtu) obj2).b.get(0)).b.get(0)).b;
                                int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 5 : 4 : 3 : 2;
                                if (i6 == 0) {
                                    i6 = 1;
                                }
                                int i7 = i6 - 2;
                                if (i7 == 1) {
                                    esvqVar = esvq.UNSUPPORTED;
                                } else if (i7 == 2) {
                                    esvqVar = esvq.SUPPORTED;
                                } else {
                                    if (i7 != 3) {
                                        if (i6 == 1) {
                                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                                        }
                                        throw new IllegalArgumentException(String.format("Unexpected compatibility state returned from RPC server: %d", Integer.valueOf(i7)));
                                    }
                                    esvqVar = esvq.UNKNOWN;
                                }
                                return dfbl.d(esvqVar);
                            }
                        }).f(new dfap() { // from class: cdyp
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0194  */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x01a8 A[LOOP:0: B:12:0x006b->B:31:0x01a8, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x01bf A[SYNTHETIC] */
                            @Override // defpackage.dfap
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.dfaq a(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 458
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyp.a(java.lang.Object):dfaq");
                            }
                        });
                    }
                });
                f.y(new dfah() { // from class: cdyr
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        ((ejhf) ((ejhf) ((ejhf) asot.this.j()).s(exc)).ah((char) 6410)).x("Failed to check if module is needed, task exception.");
                    }
                });
            } else {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 6405)).x("Device sampled out, skipping.");
                f = dfbl.d(false);
            }
        } else if (fqfq.a.a().d()) {
            f = dhqf.a(context).aL().f(new dfap() { // from class: cdyn
                @Override // defpackage.dfap
                public final dfaq a(Object obj) {
                    boolean r = ((aqye) obj).r();
                    asot asotVar2 = asot.this;
                    ((ejhf) ((ejhf) asotVar2.h()).ah((char) 6411)).B("Usage reporting opted in=%b", Boolean.valueOf(r));
                    if (!r) {
                        return dfbl.d(false);
                    }
                    Context context2 = context;
                    dodr a2 = dods.a();
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
                        eqwk eqwkVar = new eqwk();
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        eqwkVar.__reset(wrap.getInt(wrap.position()) + wrap.position(), wrap);
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
                        esvp esvpVar = new esvp(sb2, str2, str3, str4);
                        String str5 = a2.a;
                        if (str5 == null) {
                            throw new NullPointerException("Null rendererName");
                        }
                        esvr esvrVar = new esvr(str5, a2.c, a2.d);
                        HashMap hashMap = new HashMap();
                        hashMap.put("tflite.android_sdk_version", esvpVar.a);
                        hashMap.put("tflite.device_model", esvpVar.b);
                        hashMap.put("tflite.device_name", esvpVar.c);
                        hashMap.put("tflite.manufacturer", esvpVar.d);
                        hashMap.put("tflite.gpu_model", esvrVar.a);
                        int i3 = esvrVar.b;
                        int i4 = esvrVar.c;
                        hashMap.put("tflite.opengl_es_version", Integer.toString(i3, 10) + "." + Integer.toString(i4, 10));
                        for (Map.Entry entry : hashMap.entrySet()) {
                            String c = eigd.c(((String) entry.getValue()).replaceAll("[ -]", "_"));
                            if (((String) entry.getKey()).equals("tflite.gpu_model")) {
                                c = esvs.a.matcher(c).replaceAll("$1");
                            }
                            entry.setValue(c);
                        }
                        int i5 = 0;
                        while (true) {
                            int __offset = eqwkVar.__offset(4);
                            if (i5 >= (__offset != 0 ? eqwkVar.__vector_len(__offset) : 0)) {
                                break;
                            }
                            eqwk eqwkVar2 = new eqwk();
                            int __offset2 = eqwkVar.__offset(4);
                            if (__offset2 != 0) {
                                eqwkVar2.__reset(eqwkVar.__indirect(eqwkVar.__vector(__offset2) + (i5 * 4)), eqwkVar.bb);
                            } else {
                                eqwkVar2 = null;
                            }
                            esvo.a(eqwkVar2, hashMap);
                            i5++;
                        }
                        String str6 = (String) hashMap.get("tflite.gpu.status");
                        esvq esvqVar = str6 == null ? esvq.UNKNOWN : str6.equals("SUPPORTED") ? esvq.SUPPORTED : esvq.UNSUPPORTED;
                        boolean h = fqfq.a.a().h();
                        boolean z = esvqVar == (h ? esvq.UNKNOWN : esvq.SUPPORTED);
                        ejhf ejhfVar = (ejhf) ((ejhf) asotVar2.h()).ah(6412);
                        Boolean valueOf = Boolean.valueOf(z);
                        ejhfVar.T("Device targeted=%b (target-unknown=%b, compatibility=%s)", valueOf, Boolean.valueOf(h), esvqVar);
                        return dfbl.d(valueOf);
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
            f.y(new dfah() { // from class: cdyo
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    ((ejhf) ((ejhf) ((ejhf) asot.this.j()).s(exc)).ah((char) 6413)).x("Failed to check if module is needed, task exception.");
                }
            });
        } else {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 6406)).x("Device sampled out, skipping.");
            f = dfbl.d(false);
        }
        f.z(new dfak() { // from class: cdyy
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                asot asotVar2 = MlBenchmarkInstallerModuleInitIntentOperation.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                Context context2 = context;
                if (!booleanValue) {
                    ModuleManager moduleManager = ModuleManager.get(context2);
                    ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                    featureRequest.unrequestFeature(str2);
                    boolean requestFeatures = moduleManager.requestFeatures(featureRequest);
                    ((ejhf) ((ejhf) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ah((char) 6420)).B("Feature unrequest success = %b", Boolean.valueOf(requestFeatures));
                    return;
                }
                ModuleManager moduleManager2 = ModuleManager.get(context2);
                ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
                featureCheck.checkFeatureAtVersion("mlbenchmark", 1L);
                int checkFeaturesAreAvailable = moduleManager2.checkFeaturesAreAvailable(featureCheck);
                if (checkFeaturesAreAvailable == 0) {
                    ((ejhf) ((ejhf) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ah((char) 6419)).x("Feature check success: module is already available on device");
                } else {
                    if (checkFeaturesAreAvailable != 2) {
                        ((ejhf) ((ejhf) MlBenchmarkInstallerModuleInitIntentOperation.a.j()).ah((char) 6416)).z("Feature check failure: %d", checkFeaturesAreAvailable);
                        return;
                    }
                    ((ejhf) ((ejhf) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ah((char) 6417)).x("Feature check success: module requires installation or update");
                }
                ModuleManager moduleManager3 = ModuleManager.get(context2);
                ModuleManager.FeatureRequest featureRequest2 = new ModuleManager.FeatureRequest();
                featureRequest2.requestFeatureAtAnyVersion(str2);
                boolean requestFeatures2 = moduleManager3.requestFeatures(featureRequest2);
                ((ejhf) ((ejhf) MlBenchmarkInstallerModuleInitIntentOperation.a.h()).ah((char) 6418)).B("Feature request success = %b", Boolean.valueOf(requestFeatures2));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:13|(2:17|(16:19|(1:21)|22|(1:24)|25|(1:27)|28|29|30|(1:32)|33|(1:35)|36|37|(1:39)(1:41)|40))|45|46|47|48|(2:49|(1:51)(1:52))|53|54|(2:55|(3:57|(2:59|(2:61|62)(4:64|(2:65|(2:67|(2:70|71)(1:69))(1:79))|72|(2:74|75)(1:78)))(1:80)|63)(3:81|82|(1:(3:84|(2:86|(2:88|89)(2:91|(2:93|94)(1:95)))(1:96)|90)(2:97|98))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:3|(2:4|(2:6|(2:9|10)(1:8))(2:112|113))|11|(10:13|(2:17|(16:19|(1:21)|22|(1:24)|25|(1:27)|28|29|30|(1:32)|33|(1:35)|36|37|(1:39)(1:41)|40))|45|46|47|48|(2:49|(1:51)(1:52))|53|54|(2:55|(3:57|(2:59|(2:61|62)(4:64|(2:65|(2:67|(2:70|71)(1:69))(1:79))|72|(2:74|75)(1:78)))(1:80)|63)(3:81|82|(1:(3:84|(2:86|(2:88|89)(2:91|(2:93|94)(1:95)))(1:96)|90)(2:97|98)))))|111|(0)|22|(0)|25|(0)|28|29|30|(0)|33|(0)|36|37|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0147, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0148, code lost:
    
        ((defpackage.ejhf) ((defpackage.ejhf) defpackage.crza.a.j()).s(r13)).B("Unable to read %s", defpackage.crza.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d5, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d6, code lost:
    
        r3 = (defpackage.ejhf) ((defpackage.ejhf) com.google.android.gms.mlbenchmark.installer.service.MlBenchmarkInstallerModuleInitIntentOperation.a.j()).ah(6425);
        r13 = r13.a;
        r3.G("Failed to get GPU info, EGL error %d: %s", r13, android.opengl.GLUtils.getEGLErrorString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
    
        if (r13 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
    
        ((defpackage.ejhf) defpackage.crza.a.j()).x("Unknown chipset!");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a8 A[Catch: dodq -> 0x01d5, TryCatch #2 {dodq -> 0x01d5, blocks: (B:30:0x019a, B:32:0x01a8, B:33:0x01ab, B:35:0x01c2, B:36:0x01c5), top: B:29:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2 A[Catch: dodq -> 0x01d5, TryCatch #2 {dodq -> 0x01d5, blocks: (B:30:0x019a, B:32:0x01a8, B:33:0x01ab, B:35:0x01c2, B:36:0x01c5), top: B:29:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0264  */
    @Override // defpackage.anya
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

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 6421)).B("Intent: %s", action);
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !asqg.f("com.google.android.gms.mlbenchmark#com.google.android.gms").equals(action)) {
            super.onHandleIntent(intent);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 6422)).B("COMMITTED Extra package name: %s", stringExtra);
        if ("com.google.android.gms.mlbenchmark#com.google.android.gms".equals(stringExtra)) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 6423)).x("Phenotype configuration committed.");
            dvlw.f(dvmh.a("com.google.android.gms.mlbenchmark#com.google.android.gms"));
            f(getApplicationContext());
        }
    }
}
