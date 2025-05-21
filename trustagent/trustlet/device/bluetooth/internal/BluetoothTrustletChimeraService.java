package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import defpackage.arlb;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.byhr;
import defpackage.dgls;
import defpackage.dgme;
import defpackage.dgmx;
import defpackage.dgmy;
import defpackage.dgnb;
import defpackage.dgnc;
import defpackage.dgne;
import defpackage.dgpz;
import defpackage.dgqc;
import defpackage.dgqd;
import defpackage.dgqe;
import defpackage.dgqj;
import defpackage.dgsx;
import defpackage.dgsy;
import defpackage.ejhf;
import defpackage.ekhd;
import defpackage.ekhf;
import defpackage.ekhg;
import defpackage.fecj;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BluetoothTrustletChimeraService extends dgme implements dgpz, dgls {
    private static final asot g = asot.b("TrustAgent", asej.TRUSTAGENT);
    private static final Object h = new Object();
    public SharedPreferences d;
    public dgnb e;
    private volatile boolean i;
    private dgqc j;
    private ConcurrentMap k;
    private ScreenOnOffReceiver n;
    private SharedPreferences.OnSharedPreferenceChangeListener o;
    private final Set l = new HashSet();
    private final Map m = new HashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();

    private final void B() {
        for (dgqj dgqjVar : this.k.values()) {
            synchronized (h) {
                BluetoothDevice bluetoothDevice = dgqjVar.a;
                if (dgsx.i(bluetoothDevice)) {
                    this.m.put(bluetoothDevice, true);
                } else if (bluetoothDevice.isConnected()) {
                    this.m.put(bluetoothDevice, false);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v((dgqj) arrayList.get(i), false);
        }
    }

    private final void C() {
        synchronized (h) {
            boolean isEmpty = this.k.isEmpty();
            boolean z = !isEmpty;
            boolean z2 = false;
            if (!isEmpty && A()) {
                z2 = true;
            }
            jT(z, z2);
        }
    }

    private static final void D() {
        ekhf ekhfVar = ekhf.BLUETOOTH_TRUSTLET;
        fecj v = ekhg.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekhg ekhgVar = (ekhg) v.b;
        ekhgVar.c = ekhfVar.g;
        ekhgVar.b |= 1;
        dgmy.a((ekhg) v.Q());
    }

    protected final boolean A() {
        return arlb.a(this) != null && arlb.a(this).isEnabled();
    }

    @Override // defpackage.dgme
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Bluetooth");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", dgsx.k());
        bundle.putBoolean("key_trustlet_has_required_permissions", true);
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_trusted_devices_key");
        bundle.putString("key_trustlet_pref_title", dgsy.b(this));
        bundle.putString("key_trustlet_pref_summary", dgsy.a(this));
        bundle.putInt("key_trustlet_icon_res_id", R.drawable.quantum_gm_ic_devices_other_vd_theme_24);
        bundle.putString("key_trustlet_settings_activity_class_name", "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    @Override // defpackage.dgme
    public final ekhf e() {
        return ekhf.BLUETOOTH_TRUSTLET;
    }

    @Override // defpackage.dgme
    public final String f() {
        return "Bluetooth";
    }

    @Override // defpackage.dgme
    public final void g() {
        this.n.c();
        this.d.unregisterOnSharedPreferenceChangeListener(this.o);
        dgqc dgqcVar = this.j;
        if (dgqcVar.d) {
            dgqcVar.b.unregisterReceiver(dgqcVar.c);
            dgqcVar.e.f(dgqcVar.g);
            dgqcVar.f.f(dgqcVar.h);
            dgqcVar.d = false;
        }
        synchronized (h) {
            this.i = false;
        }
        super.g();
    }

    @Override // defpackage.dgpz
    public final void h(boolean z) {
        if (z) {
            if (this.k.isEmpty()) {
                w();
            } else {
                Iterator it = this.k.values().iterator();
                while (it.hasNext()) {
                    y((dgqj) it.next());
                }
            }
        }
        B();
        C();
        z();
    }

    @Override // defpackage.dgme
    public final void i() {
        super.i();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Object obj = h;
        synchronized (obj) {
            this.k = concurrentHashMap;
        }
        this.d = dgnc.a(this);
        this.e = new dgmx(this.d);
        dgqd dgqdVar = new dgqd(this);
        this.o = dgqdVar;
        this.d.registerOnSharedPreferenceChangeListener(dgqdVar);
        ScreenOnOffReceiver screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        this.n = screenOnOffReceiver;
        screenOnOffReceiver.b();
        if (this.j == null) {
            this.j = new dgqc(this, this);
        }
        dgqc dgqcVar = this.j;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        dgqcVar.b.registerReceiver(dgqcVar.c, intentFilter);
        dgqcVar.e.a(dgqcVar.g);
        dgqcVar.f.a(dgqcVar.h);
        dgqcVar.d = true;
        synchronized (obj) {
            this.i = true;
        }
        w();
        z();
    }

    @Override // defpackage.dgpz
    public final void j(BluetoothDevice bluetoothDevice) {
        dgqj dgqjVar = (dgqj) this.k.get(bluetoothDevice.getAddress());
        if (dgqjVar != null) {
            y(dgqjVar);
        } else {
            this.e.g(dgsx.g(bluetoothDevice.getAddress()));
            this.e.c();
        }
        z();
    }

    @Override // defpackage.dgls
    public final void jM() {
        z();
    }

    @Override // defpackage.dgpz
    public final void k(String str) {
        B();
        z();
        if (arlb.a(this) != null) {
            BluetoothDevice remoteDevice = arlb.a(this).getRemoteDevice(str);
            int i = dgsx.a;
            if (remoteDevice.isConnected() && this.f.putIfAbsent(remoteDevice, Boolean.TRUE) == null) {
                System.currentTimeMillis();
                new byhr().postDelayed(new dgqe(this, remoteDevice), 15000L);
            }
        }
    }

    @Override // defpackage.dgpz
    public final boolean l(BluetoothDevice bluetoothDevice) {
        return this.k.containsKey(bluetoothDevice.getAddress());
    }

    @Override // defpackage.dgme
    public final boolean p() {
        return dgne.a().a;
    }

    @Override // defpackage.dgme
    public final boolean q() {
        return dgsx.k();
    }

    @Override // defpackage.dgme
    public final void u(fecj fecjVar) {
        ekhd ekhdVar = ((ekhg) fecjVar.b).i;
        if (ekhdVar == null) {
            ekhdVar = ekhd.a;
        }
        fecj fecjVar2 = (fecj) ekhdVar.iB(5, null);
        fecjVar2.X(ekhdVar);
        boolean o = o();
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        ekhd ekhdVar2 = (ekhd) fecjVar2.b;
        ekhdVar2.b |= 1;
        ekhdVar2.c = o;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekhg ekhgVar = (ekhg) fecjVar.b;
        ekhd ekhdVar3 = (ekhd) fecjVar2.Q();
        ekhdVar3.getClass();
        ekhgVar.i = ekhdVar3;
        ekhgVar.b |= 128;
    }

    public final void v(dgqj dgqjVar, boolean z) {
        if (dgqjVar == null) {
            return;
        }
        BluetoothDevice bluetoothDevice = dgqjVar.a;
        if (!dgsx.i(bluetoothDevice)) {
            if (this.d.getBoolean(dgsx.h(bluetoothDevice.getAddress()), true)) {
                dgqjVar.a.getName();
                this.l.add(dgqjVar);
                return;
            }
        }
        synchronized (h) {
            String address = bluetoothDevice.getAddress();
            if (dgqjVar.a()) {
                if (this.k.containsKey(address)) {
                    this.k.replace(address, dgqjVar);
                } else {
                    this.k.put(address, dgqjVar);
                }
                this.e.g("no_notification_for_device_".concat(String.valueOf(address)));
                this.e.c();
                C();
                if (z) {
                    D();
                }
                z();
            } else {
                ((ejhf) ((ejhf) g.i()).ah(11688)).B("Adding a non bonded Bluetooth device %s, ignored.", address);
            }
        }
        this.l.remove(dgqjVar);
    }

    protected final void w() {
        for (String str : this.d.getAll().keySet()) {
            String a = dgsx.a(str);
            if (a != null) {
                BluetoothDevice bluetoothDevice = null;
                if (arlb.a(this) != null) {
                    try {
                        bluetoothDevice = arlb.a(this).getRemoteDevice(a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (bluetoothDevice != null && this.d.getBoolean(str, false)) {
                    dgqj dgqjVar = new dgqj(bluetoothDevice);
                    if (dgqjVar.a()) {
                        v(dgqjVar, false);
                    } else {
                        y(dgqjVar);
                    }
                }
            }
        }
        C();
        z();
    }

    public final void x(String str) {
        synchronized (h) {
            if (((dgqj) this.k.remove(str)) != null) {
                D();
                C();
                z();
            }
        }
    }

    protected final void y(dgqj dgqjVar) {
        if (!A() || dgqjVar.a()) {
            return;
        }
        x(dgqjVar.a.getAddress());
        dgnb dgnbVar = this.e;
        dgqj.b(dgnbVar, dgqjVar.b);
        dgqj.b(dgnbVar, dgqjVar.c);
        dgnbVar.c();
    }

    public final void z() {
        synchronized (h) {
            if (this.i) {
                dgqj dgqjVar = null;
                for (dgqj dgqjVar2 : this.k.values()) {
                    BluetoothDevice bluetoothDevice = dgqjVar2.a;
                    if (dgsx.i(bluetoothDevice)) {
                        bluetoothDevice.getName();
                        dgqjVar = dgqjVar2;
                    }
                }
                if (r() && dgqjVar == null) {
                    jR("No trusted connected device, revoking trust.");
                } else {
                    if (r() || dgqjVar == null) {
                        return;
                    }
                    String name = dgqjVar.a.getName();
                    jO(getString(R.string.auth_trust_agent_connected_to_bt_device, name), name, aseu.TRUSTAGENT_TRUSTED_DEVICES_TRUST_GRANTED);
                }
            }
        }
    }

    @Override // defpackage.dgls
    public final void jL() {
    }

    @Override // defpackage.dgls
    public final void jS() {
    }
}
