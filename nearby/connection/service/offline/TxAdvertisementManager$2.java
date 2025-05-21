package com.google.android.gms.nearby.connection.service.offline;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import com.google.android.gms.nearby.connection.service.offline.TxAdvertisementManager$2;
import defpackage.bhiy;
import defpackage.cfju;
import defpackage.cfxs;
import defpackage.cjfa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TxAdvertisementManager$2 extends bhiy {
    public final /* synthetic */ cfxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxAdvertisementManager$2(cfxs cfxsVar) {
        super("nearby", "TxAdvertisementManager");
        this.a = cfxsVar;
    }

    @Override // defpackage.bhiy
    public final void b(int i) {
        cfju.a.b().i("%s Failed to start scanning due to : %s", "[TxAdvertisementMgr]", cjfa.a(i));
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        this.a.c(new Runnable() { // from class: cfxo
            @Override // java.lang.Runnable
            public final void run() {
                byte[] serviceData;
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null || (serviceData = scanRecord.getServiceData(new ParcelUuid(cjnr.b))) == null) {
                    return;
                }
                TxAdvertisementManager$2.this.a.d(serviceData);
            }
        });
    }
}
