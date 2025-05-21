package com.google.android.gms.auth.proximity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.UserManager;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import defpackage.accv;
import defpackage.accx;
import defpackage.accz;
import defpackage.acdc;
import defpackage.acdl;
import defpackage.acdm;
import defpackage.acdo;
import defpackage.acdp;
import defpackage.acdq;
import defpackage.acdr;
import defpackage.acdz;
import defpackage.achr;
import defpackage.acqc;
import defpackage.acqe;
import defpackage.asmf;
import defpackage.asot;
import defpackage.aspj;
import defpackage.dnkq;
import defpackage.ehfm;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.flbx;
import defpackage.flcs;
import defpackage.flcw;
import defpackage.flda;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BlePeripheralChimeraService extends Service implements acdl, accx {
    public static final asot a = acqc.a("BlePeripheralService");
    public acdm d;
    private ehfm g;
    private accz h;
    private boolean i;
    public final achr b = achr.c();
    public final acdz c = acdz.a();
    private final acdr e = new acdr(UUID.fromString("f21843b0-9411-434b-b85f-a9b92bd69f77"));
    private final ensv f = new asmf(1, 10);
    private final acqe j = new acqe();

    public static Intent d(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.BlePeripheralService");
    }

    private final void g() {
        ehfm ehfmVar = this.g;
        if (ehfmVar != null) {
            ehfmVar.j();
            this.g = null;
        }
    }

    @Override // defpackage.accx
    public final void a(final byte[] bArr) {
        aspj.b(bArr);
        this.e.b = bArr;
        if (flcw.R()) {
            this.f.execute(new Runnable() { // from class: acdn
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr2 = bArr;
                    acgj c = acgj.c(BlePeripheralChimeraService.this);
                    feay w = feay.w(bArr2);
                    try {
                        c.e();
                        c.g.a().f(w, aspu.a(c.b).j());
                    } catch (rkt e) {
                        ((ejhf) ((ejhf) acgj.a.j()).s(e)).x("onEidChanged error");
                    }
                }
            });
        }
    }

    @Override // defpackage.acdl
    public final synchronized void b() {
        e();
    }

    @Override // defpackage.acdl
    public final void c() {
        f();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== BlePeripheralService Dump ====\n\n");
        accz acczVar = this.h;
        if (acczVar == null) {
            printWriter.append("No current background advertiser.\n");
            return;
        }
        if (!acczVar.h) {
            printWriter.append("No active background advertisement.\n");
            return;
        }
        String str = acczVar.e;
        printWriter.append("Current advertising background EID: ");
        if (str == null) {
            str = "null";
        }
        printWriter.append((CharSequence) str);
        printWriter.append("\n");
    }

    public final void e() {
        if (this.i) {
            this.i = false;
            if (this.g != null || this.d == null) {
                return;
            }
            acdr acdrVar = this.e;
            this.g = new ehfm(UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), UUID.fromString("00000100-0004-1000-8000-001A11000102"), UUID.fromString("00000100-0004-1000-8000-001A11000101"), acdrVar);
            Context applicationContext = getApplicationContext();
            flcw.T();
            BluetoothManager bluetoothManager = (BluetoothManager) applicationContext.getSystemService("bluetooth");
            dnkq dnkqVar = null;
            if (bluetoothManager == null) {
                ((ejhf) a.j()).x("Bluetooth manager not available, stopping service.");
                stopSelf();
            } else {
                dnkq a2 = dnkq.a(bluetoothManager.openGattServer(applicationContext, this.g.c));
                if (a2 == null) {
                    ((ejhf) a.j()).x("Failed to open GattServer.");
                    stopSelf();
                } else {
                    acdrVar.a = a2;
                    BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(UUID.fromString("00002902-0000-1000-8000-00805F9B34FB"), 16);
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(UUID.fromString("00000100-0004-1000-8000-001A11000102"), 32, 0);
                    bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(UUID.fromString("00000100-0004-1000-8000-001A11000101"), 8, 16);
                    BluetoothGattService bluetoothGattService = new BluetoothGattService(UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), 0);
                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
                    if (((UserManager) getSystemService("user")).getUserProfiles().size() > 1) {
                        bluetoothGattService.addCharacteristic(new BluetoothGattCharacteristic(UUID.fromString("f21843b0-9411-434b-b85f-a9b92bd69f77"), 2, 1));
                    }
                    a2.e(bluetoothGattService);
                    dnkqVar = a2;
                }
            }
            if (dnkqVar != null) {
                this.g.l(dnkqVar, new acdq(this));
            }
        }
    }

    public final void f() {
        accz acczVar;
        acdm acdmVar = this.d;
        if (acdmVar == null || (acczVar = this.h) == null || acczVar.h || acdmVar.h()) {
            return;
        }
        stopSelf();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        accz acczVar = new accz(this);
        this.h = acczVar;
        acczVar.j = this;
        acdm acdmVar = new acdm();
        this.d = acdmVar;
        acdmVar.n = this;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        acdm acdmVar = this.d;
        acdmVar.j.post(new acdc(acdmVar));
        this.h.d();
        this.h.j = null;
        this.d.n = null;
        this.e.a = null;
        g();
        this.d = null;
        this.h = null;
        this.g = null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (flbx.e()) {
            BluetoothManager bluetoothManager = (BluetoothManager) getApplicationContext().getSystemService("bluetooth");
            if (bluetoothManager == null) {
                ((ejhf) a.j()).x("Bluetooth manager not available, stopping service.");
                stopSelf();
                return 2;
            }
            if (bluetoothManager.getAdapter() == null) {
                ((ejhf) a.j()).x("Bluetooth adapter not available, stopping service.");
                stopSelf();
                return 2;
            }
            if (!bluetoothManager.getAdapter().isEnabled()) {
                ((ejhf) a.j()).x("Bluetooth adapter not enabled, stopping service.");
                stopSelf();
                return 2;
            }
        }
        if (!this.d.g()) {
            ((ejhf) a.j()).x("Advertising not available, stopping service.");
            stopSelf();
            return 2;
        }
        achr achrVar = this.b;
        if (!Role.b(achrVar.a())) {
            stopSelf();
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RemoteDevice remoteDevice : achrVar.e()) {
            Iterator it = achrVar.f(remoteDevice.b).iterator();
            while (it.hasNext()) {
                int i3 = ((Role) it.next()).c;
                if (Role.d(i3)) {
                    arrayList2.add(remoteDevice);
                } else if (Role.c(i3)) {
                    arrayList.add(remoteDevice);
                } else if ((i3 & 256) > 0) {
                    arrayList3.add(remoteDevice);
                }
            }
        }
        boolean z = true;
        boolean z2 = (arrayList.isEmpty() && arrayList3.isEmpty()) ? false : true;
        if (z2 || !arrayList2.isEmpty()) {
            this.d.f(arrayList2);
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                z = false;
            }
            this.i = z;
            if (!z) {
                g();
            }
            if (z2) {
                arrayList.size();
                acqe acqeVar = this.j;
                if (flcs.f() && !acqeVar.a) {
                    acqeVar.b.c(18);
                }
                accz acczVar = this.h;
                if (!acczVar.h) {
                    acczVar.c(new acdp(this));
                } else if (flda.d()) {
                    accz acczVar2 = this.h;
                    acdo acdoVar = new acdo(this);
                    if (acczVar2.i != NearbyConnectionsIntentOperation.b) {
                        accz.a.h("Restarting advertisement because Nearby listening state has changed.", new Object[0]);
                        acczVar2.d();
                        acczVar2.c(new accv(acczVar2, acdoVar));
                    }
                } else {
                    e();
                }
            } else {
                accz acczVar3 = this.h;
                if (acczVar3.h) {
                    acczVar3.d();
                }
            }
        } else {
            stopSelf();
        }
        return 2;
    }
}
