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
import defpackage.atzb;
import defpackage.atzs;
import defpackage.dkvf;
import defpackage.dkvs;
import defpackage.dkwh;
import defpackage.dkww;
import defpackage.dllj;
import defpackage.dlmz;
import defpackage.dlpa;
import defpackage.ehql;
import defpackage.ehqn;
import defpackage.eicm;
import defpackage.ejwt;
import defpackage.ejxa;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgtg;
import defpackage.fgtj;
import defpackage.fgvz;
import defpackage.fvts;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyFlowInitializationIntentOperation extends IntentOperation {
    dllj a;
    dkvf b;
    private long c = -1;

    public BuyFlowInitializationIntentOperation() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        int intExtra;
        atzb.t(initializeBuyFlowRequest.b, "PurchaseContext bytes cannot be null");
        ArrayList g = ehql.g(getApplicationContext());
        long j = this.c;
        if ((j == -1 || j + fvts.a.lK().c() <= System.currentTimeMillis()) && !new ActivityManager.MemoryInfo().lowMemory) {
            int a = (int) fvts.a.lK().a();
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
            if (dkwh.d(buyFlowConfig.b.b)) {
                String b = eicm.b(this);
                byte[][] bArr = initializeBuyFlowRequest.b;
                int length = bArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    if (this.b.b(bArr[i2], buyFlowConfig, b, g) == null) {
                        try {
                            ServerResponse j2 = this.a.j(buyFlowConfig, initializeBuyFlowRequest);
                            if (j2.b() == 38) {
                                ejxa ejxaVar = (ejxa) j2.c();
                                boolean z = 1;
                                if ((ejxaVar.b & 1) != 0 || ejxaVar.e.size() == 0) {
                                    return;
                                }
                                Iterator it = ejxaVar.e.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if ((((ejwt) it.next()).b & 4) == 0) {
                                            this.c = System.currentTimeMillis();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                dkvf dkvfVar = this.b;
                                String b2 = eicm.b(this);
                                ApplicationParameters applicationParameters = buyFlowConfig.b;
                                String str = applicationParameters.b.name;
                                int i3 = applicationParameters.a;
                                String str2 = buyFlowConfig.c;
                                atzb.t(ejxaVar, "Cannot cache null response");
                                if (ejxaVar.e.size() <= 0) {
                                    z = i;
                                }
                                atzb.c(z, "No templates to cache");
                                HashMap hashMap = new HashMap();
                                Iterator it2 = ejxaVar.e.iterator();
                                while (it2.hasNext()) {
                                    ejwt ejwtVar = (ejwt) it2.next();
                                    String str3 = str;
                                    int i4 = i3;
                                    String e = dkvf.e(ejwtVar.c.M(), str3, i4, str2, b2, g);
                                    ArrayList arrayList = (ArrayList) hashMap.get(e);
                                    if (arrayList == null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(ejwtVar);
                                        hashMap.put(e, arrayList2);
                                        str = str3;
                                        i3 = i4;
                                    } else {
                                        Iterator it3 = it2;
                                        if (((ejwt) arrayList.get(i)).h == ejwtVar.h) {
                                            arrayList.add(ejwtVar);
                                        } else {
                                            Log.w("InitTemplateCache", "Detected templates with the same purchase context but different expiration dates, ignoring!");
                                        }
                                        str = str3;
                                        i3 = i4;
                                        it2 = it3;
                                        i = 0;
                                    }
                                }
                                SharedPreferences.Editor edit = dkvfVar.a.edit();
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str4 = (String) entry.getKey();
                                    ArrayList arrayList3 = (ArrayList) entry.getValue();
                                    fgrc fgrcVar = (fgrc) ejxaVar.iQ(5, null);
                                    fgrcVar.X(ejxaVar);
                                    int size = arrayList3.size();
                                    if (!fgrcVar.b.L()) {
                                        fgrcVar.U();
                                    }
                                    ((ejxa) fgrcVar.b).e = fgtj.a;
                                    long currentTimeMillis = System.currentTimeMillis() + ((ejwt) arrayList3.get(0)).h;
                                    for (int i5 = 0; i5 < size; i5++) {
                                        ejwt ejwtVar2 = (ejwt) arrayList3.get(i5);
                                        fgrc fgrcVar2 = (fgrc) ejwtVar2.iQ(5, null);
                                        fgrcVar2.X(ejwtVar2);
                                        if (!fgrcVar2.b.L()) {
                                            fgrcVar2.U();
                                        }
                                        ejwt ejwtVar3 = (ejwt) fgrcVar2.b;
                                        ejwtVar3.b |= 16;
                                        ejwtVar3.h = currentTimeMillis;
                                        ejwt ejwtVar4 = (ejwt) fgrcVar2.Q();
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        ejxa ejxaVar2 = (ejxa) fgrcVar.b;
                                        ejwtVar4.getClass();
                                        fgsa fgsaVar = ejxaVar2.e;
                                        if (!fgsaVar.c()) {
                                            ejxaVar2.e = fgri.E(fgsaVar);
                                        }
                                        ejxaVar2.e.add(ejwtVar4);
                                    }
                                    edit.putString(str4, ehqn.g(fgrcVar.Q()));
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
        this.a = new dlmz(this, new dkww(applicationContext), dkvs.a(applicationContext));
        this.b = new dkvf(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) atzs.b(intent, "BuyFlowInitializationIntentOperation.buyflowConfig", BuyFlowConfig.CREATOR);
        int i = 1;
        atzb.c(buyFlowConfig != null, "Buy Flow config not specified.");
        boolean booleanExtra = intent.getBooleanExtra("BuyFlowInitializationIntentOperation.refreshBuyflowRequests", false);
        InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) atzs.b(intent, "BuyFlowInitializationIntentOperation.initializeBuyFlowRequest", InitializeBuyFlowRequest.CREATOR);
        atzb.c((booleanExtra && initializeBuyFlowRequest == null) || !(booleanExtra || initializeBuyFlowRequest == null), "Invalid intent extras");
        if (!booleanExtra) {
            a(buyFlowConfig, initializeBuyFlowRequest);
            return;
        }
        dkvf dkvfVar = this.b;
        String str = buyFlowConfig.b.b.name;
        int i2 = buyFlowConfig.b.a;
        HashSet hashSet = new HashSet();
        for (String str2 : dkvfVar.a.getAll().keySet()) {
            if (!"VERSION".equals(str2)) {
                fgvz fgvzVar = (fgvz) ehqn.d(str2, (fgtg) fgvz.a.iQ(7, null));
                if (fgvzVar.d.equals(str) && fgvzVar.e == i2) {
                    hashSet.add(fgvzVar.g);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            dlpa b = BuyFlowConfig.b(buyFlowConfig);
            b.d(str3);
            b.c(null);
            BuyFlowConfig a = b.a();
            dkvf dkvfVar2 = this.b;
            ApplicationParameters applicationParameters = a.b;
            String str4 = applicationParameters.b.name;
            int i3 = applicationParameters.a;
            String str5 = a.c;
            dkvfVar2.d();
            HashMap hashMap = new HashMap();
            Iterator it2 = dkvfVar2.c(str4, i3, str5).iterator();
            while (it2.hasNext()) {
                fgvz fgvzVar2 = (fgvz) it2.next();
                ByteBuffer wrap = ByteBuffer.wrap(fgvzVar2.c.M());
                int booleanValue = hashMap.containsKey(wrap) ? ((Boolean) hashMap.get(wrap)).booleanValue() : i;
                ejxa a2 = dkvfVar2.a(ehqn.g(fgvzVar2));
                hashMap.put(wrap, Boolean.valueOf(((a2 != null && a2.e.size() == i && ((ejwt) a2.e.get(0)).i) ? i : 0) & booleanValue));
            }
            dkvf dkvfVar3 = this.b;
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
            SharedPreferences.Editor edit = dkvfVar3.a.edit();
            HashSet c = dkvfVar3.c(str6, i5, str7);
            for (int i6 = 0; i6 < size; i6++) {
                byte[] bArr2 = bArr[i6];
                Iterator it4 = c.iterator();
                while (it4.hasNext()) {
                    fgvz fgvzVar3 = (fgvz) it4.next();
                    if (Arrays.equals(fgvzVar3.c.M(), bArr2)) {
                        edit.remove(ehqn.g(fgvzVar3));
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
