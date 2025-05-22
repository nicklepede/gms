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
import defpackage.aecv;
import defpackage.aecx;
import defpackage.aecz;
import defpackage.aedc;
import defpackage.aedl;
import defpackage.aedm;
import defpackage.aedo;
import defpackage.aedp;
import defpackage.aedq;
import defpackage.aedr;
import defpackage.aedz;
import defpackage.aehr;
import defpackage.aeqc;
import defpackage.aeqe;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.autd;
import defpackage.dpuz;
import defpackage.ejsr;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fntg;
import defpackage.fnub;
import defpackage.fnuf;
import defpackage.fnuj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BlePeripheralChimeraService extends Service implements aedl, aecx {
    public static final ausn a = aeqc.a("BlePeripheralService");
    public aedm d;
    private ejsr g;
    private aecz h;
    private boolean i;
    public final aehr b = aehr.c();
    public final aedz c = aedz.a();
    private final aedr e = new aedr(UUID.fromString("f21843b0-9411-434b-b85f-a9b92bd69f77"));
    private final eqgo f = new aupz(1, 10);
    private final aeqe j = new aeqe();

    public static Intent d(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.BlePeripheralService");
    }

    private final void g() {
        ejsr ejsrVar = this.g;
        if (ejsrVar != null) {
            ejsrVar.j();
            this.g = null;
        }
    }

    @Override // defpackage.aecx
    public final void a(final byte[] bArr) {
        autd.b(bArr);
        this.e.b = bArr;
        if (fnuf.R()) {
            this.f.execute(new Runnable() { // from class: aedn
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr2 = bArr;
                    aegj c = aegj.c(BlePeripheralChimeraService.this);
                    fgpr w = fgpr.w(bArr2);
                    try {
                        c.e();
                        c.g.a().f(w, auto.a(c.b).j());
                    } catch (tdx e) {
                        ((eluo) ((eluo) aegj.a.j()).s(e)).x("onEidChanged error");
                    }
                }
            });
        }
    }

    @Override // defpackage.aedl
    public final synchronized void b() {
        e();
    }

    @Override // defpackage.aedl
    public final void c() {
        f();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== BlePeripheralService Dump ====\n\n");
        aecz aeczVar = this.h;
        if (aeczVar == null) {
            printWriter.append("No current background advertiser.\n");
            return;
        }
        if (!aeczVar.h) {
            printWriter.append("No active background advertisement.\n");
            return;
        }
        String str = aeczVar.e;
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
            aedr aedrVar = this.e;
            this.g = new ejsr(UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), UUID.fromString("00000100-0004-1000-8000-001A11000102"), UUID.fromString("00000100-0004-1000-8000-001A11000101"), aedrVar);
            Context applicationContext = getApplicationContext();
            fnuf.T();
            BluetoothManager bluetoothManager = (BluetoothManager) applicationContext.getSystemService("bluetooth");
            dpuz dpuzVar = null;
            if (bluetoothManager == null) {
                ((eluo) a.j()).x("Bluetooth manager not available, stopping service.");
                stopSelf();
            } else {
                dpuz a2 = dpuz.a(bluetoothManager.openGattServer(applicationContext, this.g.c));
                if (a2 == null) {
                    ((eluo) a.j()).x("Failed to open GattServer.");
                    stopSelf();
                } else {
                    aedrVar.a = a2;
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
                    dpuzVar = a2;
                }
            }
            if (dpuzVar != null) {
                this.g.l(dpuzVar, new aedq(this));
            }
        }
    }

    public final void f() {
        aecz aeczVar;
        aedm aedmVar = this.d;
        if (aedmVar == null || (aeczVar = this.h) == null || aeczVar.h || aedmVar.h()) {
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
        aecz aeczVar = new aecz(this);
        this.h = aeczVar;
        aeczVar.j = this;
        aedm aedmVar = new aedm();
        this.d = aedmVar;
        aedmVar.n = this;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        aedm aedmVar = this.d;
        aedmVar.j.post(new aedc(aedmVar));
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
        if (fntg.e()) {
            BluetoothManager bluetoothManager = (BluetoothManager) getApplicationContext().getSystemService("bluetooth");
            if (bluetoothManager == null) {
                ((eluo) a.j()).x("Bluetooth manager not available, stopping service.");
                stopSelf();
                return 2;
            }
            if (bluetoothManager.getAdapter() == null) {
                ((eluo) a.j()).x("Bluetooth adapter not available, stopping service.");
                stopSelf();
                return 2;
            }
            if (!bluetoothManager.getAdapter().isEnabled()) {
                ((eluo) a.j()).x("Bluetooth adapter not enabled, stopping service.");
                stopSelf();
                return 2;
            }
        }
        if (!this.d.g()) {
            ((eluo) a.j()).x("Advertising not available, stopping service.");
            stopSelf();
            return 2;
        }
        aehr aehrVar = this.b;
        if (!Role.b(aehrVar.a())) {
            stopSelf();
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RemoteDevice remoteDevice : aehrVar.e()) {
            Iterator it = aehrVar.f(remoteDevice.b).iterator();
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
                aeqe aeqeVar = this.j;
                if (fnub.f() && !aeqeVar.a) {
                    aeqeVar.b.c(18);
                }
                aecz aeczVar = this.h;
                if (!aeczVar.h) {
                    aeczVar.c(new aedp(this));
                } else if (fnuj.d()) {
                    aecz aeczVar2 = this.h;
                    aedo aedoVar = new aedo(this);
                    if (aeczVar2.i != NearbyConnectionsIntentOperation.b) {
                        aecz.a.h("Restarting advertisement because Nearby listening state has changed.", new Object[0]);
                        aeczVar2.d();
                        aeczVar2.c(new aecv(aeczVar2, aedoVar));
                    }
                } else {
                    e();
                }
            } else {
                aecz aeczVar3 = this.h;
                if (aeczVar3.h) {
                    aeczVar3.d();
                }
            }
        } else {
            stopSelf();
        }
        return 2;
    }
}
