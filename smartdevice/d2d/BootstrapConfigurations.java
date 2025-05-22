package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.bsj;
import defpackage.dfho;
import defpackage.dfjg;
import defpackage.fywe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BootstrapConfigurations extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfho();
    public static final Map a;
    public final Set b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public ArrayList g;
    public Bundle h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public long m;
    public DeviceDetails n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public AccountPickerOptions s;
    public AuthenticatingUser t;
    public boolean u;
    public UiCustomization v;

    static {
        bsj bsjVar = new bsj();
        bsjVar.put("wifiNetworkSsid", new FastJsonResponse$Field(7, false, 7, false, "wifiNetworkSsid", 2, null));
        bsjVar.put("wifiNetworkPassword", new FastJsonResponse$Field(7, false, 7, false, "wifiNetworkPassword", 3, null));
        bsjVar.put("wifiNetworkSecurity", new FastJsonResponse$Field(7, false, 7, false, "wifiNetworkSecurity", 4, null));
        bsjVar.put("isLockScreenShown", new FastJsonResponse$Field(6, false, 6, false, "isLockScreenShown", 5, null));
        bsjVar.put("bootstrapAccounts", new FastJsonResponse$Field(11, true, 11, true, "bootstrapAccounts", 6, BootstrapAccount.class));
        bsjVar.put("extraParameters", new FastJsonResponse$Field(10, false, 10, false, "extraParameters", 7, null));
        bsjVar.put("hasUserConfirmed", new FastJsonResponse$Field(6, false, 6, false, "hasUserConfirmed", 8, null));
        bsjVar.put("supportsUnencryptedCommunication", new FastJsonResponse$Field(6, false, 6, false, "supportsUnencryptedCommunication", 9, null));
        bsjVar.put("maxPacketSize", new FastJsonResponse$Field(0, false, 0, false, "maxPacketSize", 10, null));
        bsjVar.put("optionFlags", new FastJsonResponse$Field(2, false, 2, false, "optionFlags", 11, null));
        bsjVar.put("optionFlagSetIndicators", new FastJsonResponse$Field(2, false, 2, false, "optionFlagSetIndicators", 12, null));
        bsjVar.put("deviceDetails", new FastJsonResponse$Field(11, false, 11, false, "deviceDetails", 13, DeviceDetails.class));
        bsjVar.put("nearbyDirectTransfer", new FastJsonResponse$Field(6, false, 6, false, "nearbyDirectTransfer", 14, null));
        bsjVar.put("targetNearbyDirectTransfer", new FastJsonResponse$Field(6, false, 6, false, "targetNearbyDirectTransfer", 15, null));
        bsjVar.put("hideSkipAccount", new FastJsonResponse$Field(6, false, 6, false, "hideSkipAccount", 16, null));
        bsjVar.put("accountPickerEnabled", new FastJsonResponse$Field(6, false, 6, false, "accountPickerEnabled", 17, null));
        bsjVar.put("accountPickerOptions", new FastJsonResponse$Field(11, false, 11, false, "accountPickerOptions", 18, AccountPickerOptions.class));
        bsjVar.put("authenticatingUser", new FastJsonResponse$Field(11, false, 11, false, "authenticatingUser", 19, AuthenticatingUser.class));
        bsjVar.put("unicornChallengeDeduplicationEnabled", new FastJsonResponse$Field(6, false, 6, false, "unicornChallengeDeduplicationEnabled", 20, null));
        bsjVar.put("uiCustomization", new FastJsonResponse$Field(11, false, 11, false, "uiCustomization", 21, UiCustomization.class));
        a = bsjVar;
    }

    public BootstrapConfigurations(Set set, String str, String str2, String str3, boolean z, ArrayList arrayList, Bundle bundle, boolean z2, boolean z3, int i, long j, long j2, DeviceDetails deviceDetails, boolean z4, boolean z5, boolean z6, boolean z7, AccountPickerOptions accountPickerOptions, AuthenticatingUser authenticatingUser, boolean z8, UiCustomization uiCustomization) {
        this.b = set;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = arrayList;
        this.h = bundle;
        this.i = z2;
        this.j = z3;
        this.k = i;
        this.l = j;
        this.m = j2;
        this.n = deviceDetails;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = accountPickerOptions;
        this.t = authenticatingUser;
        this.u = z8;
        this.v = uiCustomization;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return Boolean.valueOf(this.f);
            case 6:
                return this.g;
            case 7:
                return q();
            case 8:
                return Boolean.valueOf(this.i);
            case 9:
                return Boolean.valueOf(this.j);
            case 10:
                return Integer.valueOf(this.k);
            case 11:
                return Long.valueOf(this.l);
            case 12:
                return Long.valueOf(this.m);
            case 13:
                return this.n;
            case 14:
                return Boolean.valueOf(this.o);
            case 15:
                return Boolean.valueOf(this.p);
            case 16:
                return Boolean.valueOf(this.q);
            case fywe.q /* 17 */:
                return Boolean.valueOf(this.r);
            case 18:
                return this.s;
            case 19:
                return this.t;
            case fywe.t /* 20 */:
                return Boolean.valueOf(this.u);
            case fywe.u /* 21 */:
                return this.v;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    protected final void ae(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        int i = fastJsonResponse$Field.g;
        if (i != 7) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string map.", Integer.valueOf(i)));
        }
        u(map);
        this.b.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final Map b() {
        return a;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.b.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = str2;
        } else if (i == 3) {
            this.d = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.b.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 6) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not a known array of custom type.)"));
        }
        this.g = arrayList;
        this.b.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 13) {
            this.n = (DeviceDetails) aulmVar;
        } else if (i == 21) {
            this.v = (UiCustomization) aulmVar;
        } else if (i == 18) {
            this.s = (AccountPickerOptions) aulmVar;
        } else {
            if (i != 19) {
                throw new IllegalArgumentException(String.format("Field with id=%d not a concrete type", Integer.valueOf(i)));
            }
            this.t = (AuthenticatingUser) aulmVar;
        }
        this.b.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 10) {
            throw new IllegalStateException(String.format("Field with id=%d  is not known to be an integer.", Integer.valueOf(i2)));
        }
        this.k = i;
        this.b.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.f = z;
        } else if (i == 20) {
            this.u = z;
        } else if (i == 8) {
            this.i = z;
        } else if (i != 9) {
            switch (i) {
                case 14:
                    this.o = z;
                    break;
                case 15:
                    this.p = z;
                    break;
                case 16:
                    this.q = z;
                    break;
                case fywe.q /* 17 */:
                    this.r = z;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
            }
        } else {
            this.j = z;
        }
        this.b.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 11) {
            this.l = j;
        } else {
            if (i != 12) {
                throw new IllegalStateException(String.format("Field id %d is not a known long", Integer.valueOf(i)));
            }
            this.m = j;
        }
        this.b.add(Integer.valueOf(i));
    }

    public final dfjg p() {
        return new dfjg(this.l, this.m);
    }

    public final Map q() {
        if (this.h == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Bundle bundle = this.h;
        if (bundle == null) {
            return Collections.EMPTY_MAP;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                hashMap.put(str, string);
            }
        }
        return hashMap;
    }

    public final void r(AuthenticatingUser authenticatingUser) {
        this.t = authenticatingUser;
        this.b.add(19);
    }

    public final void s(ArrayList arrayList) {
        this.g = arrayList;
        this.b.add(6);
    }

    public final void t(DeviceDetails deviceDetails) {
        this.n = deviceDetails;
        this.b.add(13);
    }

    public final void u(Map map) {
        Bundle bundle;
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle = bundle2;
        }
        this.h = bundle;
        this.b.add(7);
    }

    public final void v(int i) {
        this.k = i;
        this.b.add(10);
    }

    public final void w(dfjg dfjgVar) {
        this.l = dfjgVar.a;
        Set set = this.b;
        set.add(11);
        this.m = dfjgVar.b;
        set.add(12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.b;
        int a2 = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            atzr.v(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            atzr.e(parcel, 5, this.f);
        }
        if (set.contains(6)) {
            atzr.y(parcel, 6, this.g, true);
        }
        if (set.contains(7)) {
            atzr.g(parcel, 7, this.h, true);
        }
        if (set.contains(8)) {
            atzr.e(parcel, 8, this.i);
        }
        if (set.contains(9)) {
            atzr.e(parcel, 9, this.j);
        }
        if (set.contains(10)) {
            atzr.o(parcel, 10, this.k);
        }
        if (set.contains(11)) {
            atzr.q(parcel, 11, this.l);
        }
        if (set.contains(12)) {
            atzr.q(parcel, 12, this.m);
        }
        if (set.contains(13)) {
            atzr.t(parcel, 13, this.n, i, true);
        }
        if (set.contains(14)) {
            atzr.e(parcel, 14, this.o);
        }
        if (set.contains(15)) {
            atzr.e(parcel, 15, this.p);
        }
        if (set.contains(16)) {
            atzr.e(parcel, 16, this.q);
        }
        if (set.contains(17)) {
            atzr.e(parcel, 17, this.r);
        }
        if (set.contains(18)) {
            atzr.t(parcel, 18, this.s, i, true);
        }
        if (set.contains(19)) {
            atzr.t(parcel, 19, this.t, i, true);
        }
        if (set.contains(20)) {
            atzr.e(parcel, 20, this.u);
        }
        if (set.contains(21)) {
            atzr.t(parcel, 21, this.v, i, true);
        }
        atzr.c(parcel, a2);
    }

    public final void x(boolean z) {
        this.u = z;
        this.b.add(20);
    }

    public BootstrapConfigurations() {
        this.b = new HashSet();
    }

    public BootstrapConfigurations(String str, String str2, String str3, boolean z, ArrayList arrayList, Map map, long j, long j2) {
        this();
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = arrayList;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = j;
        this.m = j2;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        this.h = bundle;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.b.add(2);
        this.b.add(3);
        this.b.add(4);
        this.b.add(5);
        this.b.add(6);
        this.b.add(7);
        this.b.add(8);
        this.b.add(9);
        this.b.add(10);
        this.b.add(11);
        this.b.add(12);
        this.b.add(17);
        this.b.add(18);
        this.b.add(19);
        this.b.add(20);
        this.b.add(21);
    }
}
