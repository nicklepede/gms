package com.google.android.gms.wallet.intentoperation.orchestration;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.dijv;
import defpackage.dikh;
import defpackage.dikw;
import defpackage.dill;
import defpackage.dizq;
import defpackage.djbg;
import defpackage.djdh;
import defpackage.efdi;
import defpackage.efdk;
import defpackage.efpj;
import defpackage.ehjn;
import defpackage.ehju;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.feen;
import defpackage.feeq;
import defpackage.fehg;
import defpackage.fsxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyFlowInitializationIntentOperation extends IntentOperation {
    dizq a;
    dijv b;
    private long c = -1;

    public BuyFlowInitializationIntentOperation() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        int intExtra;
        arwm.t(initializeBuyFlowRequest.b, "PurchaseContext bytes cannot be null");
        ArrayList g = efdi.g(getApplicationContext());
        long j = this.c;
        if ((j == -1 || j + fsxy.a.a().c() <= System.currentTimeMillis()) && !new ActivityManager.MemoryInfo().lowMemory) {
            int a = (int) fsxy.a.a().a();
            if (a >= 0 && a <= 100) {
                Intent registerReceiver = getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null && (intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1 && ((int) Math.floor((intExtra2 / intExtra3) * 100.0d)) < a) {
                        return;
                    }
                }
            }
            if (dikw.d(buyFlowConfig.b.b)) {
                String b = efpj.b(this);
                byte[][] bArr = initializeBuyFlowRequest.b;
                int length = bArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    if (this.b.b(bArr[i2], buyFlowConfig, b, g) == null) {
                        try {
                            ServerResponse j2 = this.a.j(buyFlowConfig, initializeBuyFlowRequest);
                            if (j2.b() == 38) {
                                ehju ehjuVar = (ehju) j2.c();
                                boolean z = 1;
                                if ((ehjuVar.b & 1) != 0 || ehjuVar.e.size() == 0) {
                                    return;
                                }
                                Iterator it = ehjuVar.e.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if ((((ehjn) it.next()).b & 4) == 0) {
                                            this.c = System.currentTimeMillis();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                dijv dijvVar = this.b;
                                String b2 = efpj.b(this);
                                ApplicationParameters applicationParameters = buyFlowConfig.b;
                                String str = applicationParameters.b.name;
                                int i3 = applicationParameters.a;
                                String str2 = buyFlowConfig.c;
                                arwm.t(ehjuVar, "Cannot cache null response");
                                if (ehjuVar.e.size() <= 0) {
                                    z = i;
                                }
                                arwm.c(z, "No templates to cache");
                                HashMap hashMap = new HashMap();
                                Iterator it2 = ehjuVar.e.iterator();
                                while (it2.hasNext()) {
                                    ehjn ehjnVar = (ehjn) it2.next();
                                    String str3 = str;
                                    int i4 = i3;
                                    String e = dijv.e(ehjnVar.c.M(), str3, i4, str2, b2, g);
                                    ArrayList arrayList = (ArrayList) hashMap.get(e);
                                    if (arrayList == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(ehjnVar);
                                        hashMap.put(e, arrayList2);
                                        str = str3;
                                        i3 = i4;
                                    } else {
                                        Iterator it3 = it2;
                                        if (((ehjn) arrayList.get(i)).h == ehjnVar.h) {
                                            arrayList.add(ehjnVar);
                                        } else {
                                            Log.w("InitTemplateCache", "Detected templates with the same purchase context but different expiration dates, ignoring!");
                                        }
                                        str = str3;
                                        i3 = i4;
                                        it2 = it3;
                                        i = 0;
                                    }
                                }
                                SharedPreferences.Editor edit = dijvVar.a.edit();
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str4 = (String) entry.getKey();
                                    ArrayList arrayList3 = (ArrayList) entry.getValue();
                                    fecj fecjVar = (fecj) ehjuVar.iB(5, null);
                                    fecjVar.X(ehjuVar);
                                    int size = arrayList3.size();
                                    if (!fecjVar.b.L()) {
                                        fecjVar.U();
                                    }
                                    ((ehju) fecjVar.b).e = feeq.a;
                                    long currentTimeMillis = System.currentTimeMillis() + ((ehjn) arrayList3.get(0)).h;
                                    for (int i5 = 0; i5 < size; i5++) {
                                        ehjn ehjnVar2 = (ehjn) arrayList3.get(i5);
                                        fecj fecjVar2 = (fecj) ehjnVar2.iB(5, null);
                                        fecjVar2.X(ehjnVar2);
                                        if (!fecjVar2.b.L()) {
                                            fecjVar2.U();
                                        }
                                        ehjn ehjnVar3 = (ehjn) fecjVar2.b;
                                        ehjnVar3.b |= 16;
                                        ehjnVar3.h = currentTimeMillis;
                                        ehjn ehjnVar4 = (ehjn) fecjVar2.Q();
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        ehju ehjuVar2 = (ehju) fecjVar.b;
                                        ehjnVar4.getClass();
                                        fedh fedhVar = ehjuVar2.e;
                                        if (!fedhVar.c()) {
                                            ehjuVar2.e = fecp.E(fedhVar);
                                        }
                                        ehjuVar2.e.add(ehjnVar4);
                                    }
                                    edit.putString(str4, efdk.g(fecjVar.Q()));
                                }
                                edit.apply();
                                return;
                            }
                            return;
                        } catch (RemoteException e2) {
                            Log.e("BuyFlowInitService", "Error when fetching initialize buyflow templates.", e2);
                            return;
                        }
                    }
                    i2++;
                    i = 0;
                }
            }
        }
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() - remaining);
        return bArr;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.a = new djbg(this, new dill(applicationContext), dikh.a(applicationContext));
        this.b = new dijv(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) arxd.b(intent, "BuyFlowInitializationIntentOperation.buyflowConfig", BuyFlowConfig.CREATOR);
        int i = 1;
        arwm.c(buyFlowConfig != null, "Buy Flow config not specified.");
        boolean booleanExtra = intent.getBooleanExtra("BuyFlowInitializationIntentOperation.refreshBuyflowRequests", false);
        InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) arxd.b(intent, "BuyFlowInitializationIntentOperation.initializeBuyFlowRequest", InitializeBuyFlowRequest.CREATOR);
        arwm.c((booleanExtra && initializeBuyFlowRequest == null) || !(booleanExtra || initializeBuyFlowRequest == null), "Invalid intent extras");
        if (!booleanExtra) {
            a(buyFlowConfig, initializeBuyFlowRequest);
            return;
        }
        dijv dijvVar = this.b;
        String str = buyFlowConfig.b.b.name;
        int i2 = buyFlowConfig.b.a;
        HashSet hashSet = new HashSet();
        for (String str2 : dijvVar.a.getAll().keySet()) {
            if (!"VERSION".equals(str2)) {
                fehg fehgVar = (fehg) efdk.d(str2, (feen) fehg.a.iB(7, null));
                if (fehgVar.d.equals(str) && fehgVar.e == i2) {
                    hashSet.add(fehgVar.g);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            djdh b = BuyFlowConfig.b(buyFlowConfig);
            b.d(str3);
            b.c(null);
            BuyFlowConfig a = b.a();
            dijv dijvVar2 = this.b;
            ApplicationParameters applicationParameters = a.b;
            String str4 = applicationParameters.b.name;
            int i3 = applicationParameters.a;
            String str5 = a.c;
            dijvVar2.d();
            HashMap hashMap = new HashMap();
            Iterator it2 = dijvVar2.c(str4, i3, str5).iterator();
            while (it2.hasNext()) {
                fehg fehgVar2 = (fehg) it2.next();
                ByteBuffer wrap = ByteBuffer.wrap(fehgVar2.c.M());
                int booleanValue = hashMap.containsKey(wrap) ? ((Boolean) hashMap.get(wrap)).booleanValue() : i;
                ehju a2 = dijvVar2.a(efdk.g(fehgVar2));
                hashMap.put(wrap, Boolean.valueOf(((a2 != null && a2.e.size() == i && ((ehjn) a2.e.get(0)).i) ? i : 0) & booleanValue));
            }
            dijv dijvVar3 = this.b;
            int size = hashMap.size();
            byte[][] bArr = new byte[size][];
            Iterator it3 = hashMap.keySet().iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                bArr[i4] = b((ByteBuffer) it3.next());
                i4 += i;
            }
            ApplicationParameters applicationParameters2 = a.b;
            String str6 = applicationParameters2.b.name;
            int i5 = applicationParameters2.a;
            String str7 = a.c;
            SharedPreferences.Editor edit = dijvVar3.a.edit();
            HashSet c = dijvVar3.c(str6, i5, str7);
            for (int i6 = 0; i6 < size; i6++) {
                byte[] bArr2 = bArr[i6];
                Iterator it4 = c.iterator();
                while (it4.hasNext()) {
                    fehg fehgVar3 = (fehg) it4.next();
                    if (Arrays.equals(fehgVar3.c.M(), bArr2)) {
                        edit.remove(efdk.g(fehgVar3));
                    }
                }
            }
            edit.apply();
            ArrayList arrayList = new ArrayList();
            for (ByteBuffer byteBuffer : hashMap.keySet()) {
                if (((Boolean) hashMap.get(byteBuffer)).booleanValue()) {
                    arrayList.add(b(byteBuffer));
                }
            }
            byte[][] bArr3 = (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
            if (bArr3.length != 0) {
                a(a, new InitializeBuyFlowRequest(bArr3));
            }
            i = 1;
        }
    }

    public BuyFlowInitializationIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
