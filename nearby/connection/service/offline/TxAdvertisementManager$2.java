package com.google.android.gms.nearby.connection.service.offline;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import com.google.android.gms.nearby.connection.service.offline.TxAdvertisementManager$2;
import defpackage.bjnn;
import defpackage.chrg;
import defpackage.cifc;
import defpackage.clnf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TxAdvertisementManager$2 extends bjnn {
    public final /* synthetic */ cifc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxAdvertisementManager$2(cifc cifcVar) {
        super("nearby", "TxAdvertisementManager");
        this.a = cifcVar;
    }

    @Override // defpackage.bjnn
    public final void b(int i) {
        chrg.a.b().i("%s Failed to start scanning due to : %s", "[TxAdvertisementMgr]", clnf.a(i));
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        this.a.c(new Runnable() { // from class: ciey
            @Override // java.lang.Runnable
            public final void run() {
                byte[] serviceData;
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null || (serviceData = scanRecord.getServiceData(new ParcelUuid(clvw.b))) == null) {
                    return;
                }
                TxAdvertisementManager$2.this.a.d(serviceData);
            }
        });
    }
}
