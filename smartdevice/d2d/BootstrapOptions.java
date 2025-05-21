package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.bry;
import defpackage.dcwl;
import defpackage.dcyb;
import defpackage.fwac;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BootstrapOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcwl();
    private static final Map E;
    public String A;
    public byte B;
    public List C;
    public String D;
    public final Set a;
    public int b;
    public int c;
    public boolean d;
    public List e;
    public byte f;
    public String g;
    public CompanionApp h;
    public boolean i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public long r;
    public int s;
    public long t;
    public PostTransferAction u;
    public byte[] v;
    public EsimActivationInfo w;
    public AdvertisementOptions x;
    public int y;
    public boolean z;

    static {
        bry bryVar = new bry();
        bryVar.put("protocol", new FastJsonResponse$Field(0, false, 0, false, "protocol", 2, null));
        bryVar.put("accountRequirement", new FastJsonResponse$Field(0, false, 0, false, "accountRequirement", 3, null));
        bryVar.put("isWiFiBootstrappable", new FastJsonResponse$Field(6, false, 6, false, "isWiFiBootstrappable", 4, null));
        bryVar.put("visibleWiFiSSIDs", new FastJsonResponse$Field(7, true, 7, true, "visibleWiFiSSIDs", 5, null));
        bryVar.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 6, null));
        bryVar.put("deviceName", new FastJsonResponse$Field(7, false, 7, false, "deviceName", 7, null));
        bryVar.put("companionApp", new FastJsonResponse$Field(11, false, 11, false, "companionApp", 8, CompanionApp.class));
        bryVar.put("isSourceSideChallengeRequired", new FastJsonResponse$Field(6, false, 6, false, "isSourceSideChallengeRequired", 9, null));
        bryVar.put("flowType", new FastJsonResponse$Field(0, false, 0, false, "flowType", 10, null));
        bryVar.put("transportMedium", new FastJsonResponse$Field(0, false, 0, false, "transportMedium", 11, null));
        bryVar.put("sessionId", new FastJsonResponse$Field(2, false, 2, false, "sessionId", 12, null));
        bryVar.put("supportsDevicePolicySetup", new FastJsonResponse$Field(6, false, 6, false, "supportsDevicePolicySetup", 13, null));
        bryVar.put("supportsAccountTransferImport", new FastJsonResponse$Field(6, false, 6, false, "supportsAccountTransferImport", 14, null));
        bryVar.put("isAccountTransferImportAllowed", new FastJsonResponse$Field(6, false, 6, false, "isAccountTransferImportAllowed", 15, null));
        bryVar.put("supportsPacketMode", new FastJsonResponse$Field(6, false, 6, false, "supportsPacketMode", 16, null));
        bryVar.put("maxPacketSize", new FastJsonResponse$Field(0, false, 0, false, "maxPacketSize", 17, null));
        bryVar.put("optionFlags", new FastJsonResponse$Field(2, false, 2, false, "optionFlags", 18, null));
        bryVar.put("gmsVersion", new FastJsonResponse$Field(0, false, 0, false, "gmsVersion", 19, null));
        bryVar.put("optionFlagsSetIndicator", new FastJsonResponse$Field(2, false, 2, false, "optionFlagsSetIndicator", 20, null));
        bryVar.put("PostTransferAction", new FastJsonResponse$Field(11, false, 11, false, "PostTransferAction", 21, PostTransferAction.class));
        bryVar.put("SharedSecret", new FastJsonResponse$Field(8, false, 8, false, "SharedSecret", 22, null));
        bryVar.put("esimActivationInfo", new FastJsonResponse$Field(11, false, 11, false, "esimActivationInfo", 23, EsimActivationInfo.class));
        bryVar.put("advertisementOptions", new FastJsonResponse$Field(11, false, 11, false, "advertisementOptions", 24, AdvertisementOptions.class));
        bryVar.put("moduleVersion", new FastJsonResponse$Field(0, false, 0, false, "moduleVersion", 25, null));
        bryVar.put("nearbyDirectTransfer", new FastJsonResponse$Field(6, false, 6, false, "nearbyDirectTransfer", 26, null));
        bryVar.put("deeplinkPairingCode", new FastJsonResponse$Field(7, false, 7, false, "deeplinkPairingCode", 27, null));
        bryVar.put("targetSuwStatus", new FastJsonResponse$Field(0, false, 0, false, "targetSuwStatus", 28, null));
        bryVar.put("accountsOnTarget", new FastJsonResponse$Field(11, true, 11, true, "accountsOnTarget", 29, BootstrapAccount.class));
        bryVar.put("targetDeviceFingerprint", new FastJsonResponse$Field(7, false, 7, false, "targetDeviceFingerprint", 30, null));
        E = DesugarCollections.unmodifiableMap(bryVar);
    }

    public BootstrapOptions(Set set, int i, int i2, boolean z, List list, byte b, String str, CompanionApp companionApp, boolean z2, int i3, int i4, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, long j2, int i6, long j3, PostTransferAction postTransferAction, byte[] bArr, EsimActivationInfo esimActivationInfo, AdvertisementOptions advertisementOptions, int i7, boolean z7, String str2, byte b2, List list2, String str3) {
        this.a = set;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = list;
        this.f = b;
        this.g = str;
        this.h = companionApp;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = j;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = i5;
        this.r = j2;
        this.s = i6;
        this.t = j3;
        this.u = postTransferAction;
        this.v = bArr;
        this.w = esimActivationInfo;
        this.x = advertisementOptions;
        this.y = i7;
        this.z = z7;
        this.A = str2;
        this.B = b2;
        this.C = list2;
        this.D = str3;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return Integer.valueOf(this.c);
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return this.e;
            case 6:
                return Byte.valueOf(this.f);
            case 7:
                return this.g;
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return Integer.valueOf(this.j);
            case 11:
                return Integer.valueOf(this.k);
            case 12:
                return Long.valueOf(this.l);
            case 13:
                return Boolean.valueOf(this.m);
            case 14:
                return Boolean.valueOf(this.n);
            case 15:
                return Boolean.valueOf(this.o);
            case 16:
                return Boolean.valueOf(this.p);
            case fwac.q /* 17 */:
                return Integer.valueOf(this.q);
            case 18:
                return Long.valueOf(this.r);
            case 19:
                return Integer.valueOf(this.s);
            case fwac.t /* 20 */:
                return Long.valueOf(this.t);
            case fwac.u /* 21 */:
                return this.u;
            case fwac.v /* 22 */:
                return this.v;
            case fwac.w /* 23 */:
                return this.w;
            case fwac.x /* 24 */:
                return this.x;
            case fwac.y /* 25 */:
                return Integer.valueOf(this.y);
            case 26:
                return Boolean.valueOf(this.z);
            case fwac.A /* 27 */:
                return this.A;
            case fwac.B /* 28 */:
                return Byte.valueOf(this.B);
            case fwac.C /* 29 */:
                return this.C;
            case fwac.D /* 30 */:
                return this.D;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    public final void aj(long j) {
        this.r = j;
        this.a.add(18);
    }

    public final void ak(PostTransferAction postTransferAction) {
        this.u = postTransferAction;
        this.a.add(21);
    }

    public final void al(int i) {
        this.b = i;
        this.a.add(2);
    }

    public final void am(long j) {
        this.l = j;
        this.a.add(12);
    }

    public final void an(byte[] bArr) {
        this.v = bArr;
        this.a.add(22);
    }

    public final void ao(boolean z) {
        this.m = z;
        this.a.add(13);
    }

    public final void ap(boolean z) {
        this.p = z;
        this.a.add(16);
    }

    public final void aq(String str) {
        this.D = str;
        this.a.add(30);
    }

    public final void ar(byte b) {
        this.B = b;
        this.a.add(28);
    }

    public final boolean as() {
        return (this.c & 1) != 1;
    }

    public final boolean at() {
        return (this.c & 4) == 4;
    }

    public final boolean au() {
        return (this.c & 2) == 2;
    }

    public final void av() {
        this.w = null;
        this.a.add(23);
    }

    public final void aw() {
        this.n = true;
        this.a.add(14);
    }

    @Override // defpackage.ashs
    public final Map b() {
        return E;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 7) {
            if (i == 27) {
                this.A = str2;
            } else {
                if (i != 30) {
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
                }
                this.D = str2;
            }
        } else if (str2 == null) {
            return;
        } else {
            this.g = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 22) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
        }
        this.v = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = z;
        } else if (i == 9) {
            this.i = z;
        } else if (i != 26) {
            switch (i) {
                case 13:
                    this.m = z;
                    break;
                case 14:
                    this.n = z;
                    break;
                case 15:
                    this.o = z;
                    break;
                case 16:
                    this.p = z;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
            }
        } else {
            this.z = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 29) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.C = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
            this.h = (CompanionApp) ashsVar;
        } else if (i == 21) {
            this.u = (PostTransferAction) ashsVar;
        } else if (i == 23) {
            this.w = (EsimActivationInfo) ashsVar;
        } else {
            if (i != 24) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
            }
            this.x = (AdvertisementOptions) ashsVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = i;
        } else if (i2 == 3) {
            this.c = i;
        } else if (i2 == 6) {
            this.f = (byte) i;
        } else if (i2 == 17) {
            this.q = i;
        } else if (i2 == 19) {
            this.s = i;
        } else if (i2 == 25) {
            this.y = i;
        } else if (i2 == 28) {
            this.B = (byte) i;
        } else if (i2 == 10) {
            this.j = i;
        } else {
            if (i2 != 11) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
            }
            this.k = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gy(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 5) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
        }
        this.e = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 12) {
            this.l = j;
        } else if (i == 18) {
            this.r = j;
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
            }
            this.t = j;
        }
        this.a.add(Integer.valueOf(i));
    }

    public final dcyb p() {
        return new dcyb(this.r, this.t);
    }

    public final void q(List list) {
        this.C = list;
        this.a.add(29);
    }

    public final void r(boolean z) {
        this.o = z;
        this.a.add(15);
    }

    public final void s(String str) {
        this.g = str;
        this.a.add(7);
    }

    public final void t(byte b) {
        this.f = b;
        this.a.add(6);
    }

    public final void u(int i) {
        this.j = i;
        this.a.add(10);
    }

    public final void v(int i) {
        this.s = i;
        this.a.add(19);
    }

    public final void w(int i) {
        this.q = i;
        this.a.add(17);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.x(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.h(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            arxc.t(parcel, 8, this.h, i, true);
        }
        if (set.contains(9)) {
            arxc.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            arxc.o(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            arxc.o(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            arxc.q(parcel, 12, this.l);
        }
        if (set.contains(13)) {
            arxc.e(parcel, 13, this.m);
        }
        if (set.contains(14)) {
            arxc.e(parcel, 14, this.n);
        }
        if (set.contains(15)) {
            arxc.e(parcel, 15, this.o);
        }
        if (set.contains(16)) {
            arxc.e(parcel, 16, this.p);
        }
        if (set.contains(17)) {
            arxc.o(parcel, 17, this.q);
        }
        if (set.contains(18)) {
            arxc.q(parcel, 18, this.r);
        }
        if (set.contains(19)) {
            arxc.o(parcel, 19, this.s);
        }
        if (set.contains(20)) {
            arxc.q(parcel, 20, this.t);
        }
        if (set.contains(21)) {
            arxc.t(parcel, 21, this.u, i, true);
        }
        if (set.contains(22)) {
            arxc.i(parcel, 22, this.v, true);
        }
        if (set.contains(23)) {
            arxc.t(parcel, 23, this.w, i, true);
        }
        if (set.contains(24)) {
            arxc.t(parcel, 24, this.x, i, true);
        }
        if (set.contains(25)) {
            arxc.o(parcel, 25, this.y);
        }
        if (set.contains(26)) {
            arxc.e(parcel, 26, this.z);
        }
        if (set.contains(27)) {
            arxc.v(parcel, 27, this.A, true);
        }
        if (set.contains(28)) {
            arxc.h(parcel, 28, this.B);
        }
        if (set.contains(29)) {
            arxc.y(parcel, 29, this.C, true);
        }
        if (set.contains(30)) {
            arxc.v(parcel, 30, this.D, true);
        }
        arxc.c(parcel, a);
    }

    public final void x(int i) {
        this.y = i;
        this.a.add(25);
    }

    public final void y(long j) {
        this.t = j;
        this.a.add(20);
    }

    public BootstrapOptions() {
        this.a = new HashSet();
    }
}
