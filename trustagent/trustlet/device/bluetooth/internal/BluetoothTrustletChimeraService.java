package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import defpackage.atnq;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.caqj;
import defpackage.diwx;
import defpackage.dixj;
import defpackage.diyc;
import defpackage.diyd;
import defpackage.diyg;
import defpackage.diyh;
import defpackage.diyj;
import defpackage.djbe;
import defpackage.djbh;
import defpackage.djbi;
import defpackage.djbj;
import defpackage.djbo;
import defpackage.djec;
import defpackage.djed;
import defpackage.eluo;
import defpackage.emup;
import defpackage.emur;
import defpackage.emus;
import defpackage.fgrc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BluetoothTrustletChimeraService extends dixj implements djbe, diwx {
    private static final ausn g = ausn.b("TrustAgent", auid.TRUSTAGENT);
    private static final Object h = new Object();
    public SharedPreferences d;
    public diyg e;
    private volatile boolean i;
    private djbh j;
    private ConcurrentMap k;
    private ScreenOnOffReceiver n;
    private SharedPreferences.OnSharedPreferenceChangeListener o;
    private final Set l = new HashSet();
    private final Map m = new HashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();

    private final void B() {
        for (djbo djboVar : this.k.values()) {
            synchronized (h) {
                BluetoothDevice bluetoothDevice = djboVar.a;
                if (djec.i(bluetoothDevice)) {
                    this.m.put(bluetoothDevice, true);
                } else if (bluetoothDevice.isConnected()) {
                    this.m.put(bluetoothDevice, false);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v((djbo) arrayList.get(i), false);
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
            ki(z, z2);
        }
    }

    private static final void D() {
        emur emurVar = emur.BLUETOOTH_TRUSTLET;
        fgrc v = emus.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emus emusVar = (emus) v.b;
        emusVar.c = emurVar.g;
        emusVar.b |= 1;
        diyd.a((emus) v.Q());
    }

    protected final boolean A() {
        return atnq.a(this) != null && atnq.a(this).isEnabled();
    }

    @Override // defpackage.diwx
    public final void c() {
        z();
    }

    @Override // defpackage.dixj
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Bluetooth");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", djec.k());
        bundle.putBoolean("key_trustlet_has_required_permissions", true);
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_trusted_devices_key");
        bundle.putString("key_trustlet_pref_title", djed.b(this));
        bundle.putString("key_trustlet_pref_summary", djed.a(this));
        bundle.putInt("key_trustlet_icon_res_id", R.drawable.quantum_gm_ic_devices_other_vd_theme_24);
        bundle.putString("key_trustlet_settings_activity_class_name", "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    @Override // defpackage.dixj
    public final emur e() {
        return emur.BLUETOOTH_TRUSTLET;
    }

    @Override // defpackage.dixj
    public final String f() {
        return "Bluetooth";
    }

    @Override // defpackage.dixj
    public final void g() {
        this.n.c();
        this.d.unregisterOnSharedPreferenceChangeListener(this.o);
        djbh djbhVar = this.j;
        if (djbhVar.d) {
            djbhVar.b.unregisterReceiver(djbhVar.c);
            djbhVar.e.f(djbhVar.g);
            djbhVar.f.f(djbhVar.h);
            djbhVar.d = false;
        }
        synchronized (h) {
            this.i = false;
        }
        super.g();
    }

    @Override // defpackage.djbe
    public final void h(boolean z) {
        if (z) {
            if (this.k.isEmpty()) {
                w();
            } else {
                Iterator it = this.k.values().iterator();
                while (it.hasNext()) {
                    y((djbo) it.next());
                }
            }
        }
        B();
        C();
        z();
    }

    @Override // defpackage.dixj
    public final void i() {
        super.i();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Object obj = h;
        synchronized (obj) {
            this.k = concurrentHashMap;
        }
        this.d = diyh.a(this);
        this.e = new diyc(this.d);
        djbi djbiVar = new djbi(this);
        this.o = djbiVar;
        this.d.registerOnSharedPreferenceChangeListener(djbiVar);
        ScreenOnOffReceiver screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        this.n = screenOnOffReceiver;
        screenOnOffReceiver.b();
        if (this.j == null) {
            this.j = new djbh(this, this);
        }
        djbh djbhVar = this.j;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        djbhVar.b.registerReceiver(djbhVar.c, intentFilter);
        djbhVar.e.a(djbhVar.g);
        djbhVar.f.a(djbhVar.h);
        djbhVar.d = true;
        synchronized (obj) {
            this.i = true;
        }
        w();
        z();
    }

    @Override // defpackage.djbe
    public final void j(BluetoothDevice bluetoothDevice) {
        djbo djboVar = (djbo) this.k.get(bluetoothDevice.getAddress());
        if (djboVar != null) {
            y(djboVar);
        } else {
            this.e.g(djec.g(bluetoothDevice.getAddress()));
            this.e.c();
        }
        z();
    }

    @Override // defpackage.djbe
    public final void k(String str) {
        B();
        z();
        if (atnq.a(this) != null) {
            BluetoothDevice remoteDevice = atnq.a(this).getRemoteDevice(str);
            int i = djec.a;
            if (remoteDevice.isConnected() && this.f.putIfAbsent(remoteDevice, Boolean.TRUE) == null) {
                System.currentTimeMillis();
                new caqj().postDelayed(new djbj(this, remoteDevice), 15000L);
            }
        }
    }

    @Override // defpackage.djbe
    public final boolean l(BluetoothDevice bluetoothDevice) {
        return this.k.containsKey(bluetoothDevice.getAddress());
    }

    @Override // defpackage.dixj
    public final boolean p() {
        return diyj.a().a;
    }

    @Override // defpackage.dixj
    public final boolean q() {
        return djec.k();
    }

    @Override // defpackage.dixj
    public final void u(fgrc fgrcVar) {
        emup emupVar = ((emus) fgrcVar.b).i;
        if (emupVar == null) {
            emupVar = emup.a;
        }
        fgrc fgrcVar2 = (fgrc) emupVar.iQ(5, null);
        fgrcVar2.X(emupVar);
        boolean o = o();
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        emup emupVar2 = (emup) fgrcVar2.b;
        emupVar2.b |= 1;
        emupVar2.c = o;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emus emusVar = (emus) fgrcVar.b;
        emup emupVar3 = (emup) fgrcVar2.Q();
        emupVar3.getClass();
        emusVar.i = emupVar3;
        emusVar.b |= 128;
    }

    public final void v(djbo djboVar, boolean z) {
        if (djboVar == null) {
            return;
        }
        BluetoothDevice bluetoothDevice = djboVar.a;
        if (!djec.i(bluetoothDevice)) {
            if (this.d.getBoolean(djec.h(bluetoothDevice.getAddress()), true)) {
                djboVar.a.getName();
                this.l.add(djboVar);
                return;
            }
        }
        synchronized (h) {
            String address = bluetoothDevice.getAddress();
            if (djboVar.a()) {
                if (this.k.containsKey(address)) {
                    this.k.replace(address, djboVar);
                } else {
                    this.k.put(address, djboVar);
                }
                this.e.g("no_notification_for_device_".concat(String.valueOf(address)));
                this.e.c();
                C();
                if (z) {
                    D();
                }
                z();
            } else {
                ((eluo) ((eluo) g.i()).ai(11691)).B("Adding a non bonded Bluetooth device %s, ignored.", address);
            }
        }
        this.l.remove(djboVar);
    }

    protected final void w() {
        for (String str : this.d.getAll().keySet()) {
            String a = djec.a(str);
            if (a != null) {
                BluetoothDevice bluetoothDevice = null;
                if (atnq.a(this) != null) {
                    try {
                        bluetoothDevice = atnq.a(this).getRemoteDevice(a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (bluetoothDevice != null && this.d.getBoolean(str, false)) {
                    djbo djboVar = new djbo(bluetoothDevice);
                    if (djboVar.a()) {
                        v(djboVar, false);
                    } else {
                        y(djboVar);
                    }
                }
            }
        }
        C();
        z();
    }

    public final void x(String str) {
        synchronized (h) {
            if (((djbo) this.k.remove(str)) != null) {
                D();
                C();
                z();
            }
        }
    }

    protected final void y(djbo djboVar) {
        if (!A() || djboVar.a()) {
            return;
        }
        x(djboVar.a.getAddress());
        diyg diygVar = this.e;
        djbo.b(diygVar, djboVar.b);
        djbo.b(diygVar, djboVar.c);
        diygVar.c();
    }

    public final void z() {
        synchronized (h) {
            if (this.i) {
                djbo djboVar = null;
                for (djbo djboVar2 : this.k.values()) {
                    BluetoothDevice bluetoothDevice = djboVar2.a;
                    if (djec.i(bluetoothDevice)) {
                        bluetoothDevice.getName();
                        djboVar = djboVar2;
                    }
                }
                if (r() && djboVar == null) {
                    kg("No trusted connected device, revoking trust.");
                } else {
                    if (r() || djboVar == null) {
                        return;
                    }
                    String name = djboVar.a.getName();
                    kd(getString(R.string.auth_trust_agent_connected_to_bt_device, name), name, auio.TRUSTAGENT_TRUSTED_DEVICES_TRUST_GRANTED);
                }
            }
        }
    }

    @Override // defpackage.diwx
    public final void kb() {
    }

    @Override // defpackage.diwx
    public final void kh() {
    }
}
