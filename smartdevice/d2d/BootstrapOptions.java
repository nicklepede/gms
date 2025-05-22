package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.bsj;
import defpackage.dfhq;
import defpackage.dfjg;
import defpackage.fywe;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BootstrapOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfhq();
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
        bsj bsjVar = new bsj();
        bsjVar.put("protocol", new FastJsonResponse$Field(0, false, 0, false, "protocol", 2, null));
        bsjVar.put("accountRequirement", new FastJsonResponse$Field(0, false, 0, false, "accountRequirement", 3, null));
        bsjVar.put("isWiFiBootstrappable", new FastJsonResponse$Field(6, false, 6, false, "isWiFiBootstrappable", 4, null));
        bsjVar.put("visibleWiFiSSIDs", new FastJsonResponse$Field(7, true, 7, true, "visibleWiFiSSIDs", 5, null));
        bsjVar.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 6, null));
        bsjVar.put("deviceName", new FastJsonResponse$Field(7, false, 7, false, "deviceName", 7, null));
        bsjVar.put("companionApp", new FastJsonResponse$Field(11, false, 11, false, "companionApp", 8, CompanionApp.class));
        bsjVar.put("isSourceSideChallengeRequired", new FastJsonResponse$Field(6, false, 6, false, "isSourceSideChallengeRequired", 9, null));
        bsjVar.put("flowType", new FastJsonResponse$Field(0, false, 0, false, "flowType", 10, null));
        bsjVar.put("transportMedium", new FastJsonResponse$Field(0, false, 0, false, "transportMedium", 11, null));
        bsjVar.put("sessionId", new FastJsonResponse$Field(2, false, 2, false, "sessionId", 12, null));
        bsjVar.put("supportsDevicePolicySetup", new FastJsonResponse$Field(6, false, 6, false, "supportsDevicePolicySetup", 13, null));
        bsjVar.put("supportsAccountTransferImport", new FastJsonResponse$Field(6, false, 6, false, "supportsAccountTransferImport", 14, null));
        bsjVar.put("isAccountTransferImportAllowed", new FastJsonResponse$Field(6, false, 6, false, "isAccountTransferImportAllowed", 15, null));
        bsjVar.put("supportsPacketMode", new FastJsonResponse$Field(6, false, 6, false, "supportsPacketMode", 16, null));
        bsjVar.put("maxPacketSize", new FastJsonResponse$Field(0, false, 0, false, "maxPacketSize", 17, null));
        bsjVar.put("optionFlags", new FastJsonResponse$Field(2, false, 2, false, "optionFlags", 18, null));
        bsjVar.put("gmsVersion", new FastJsonResponse$Field(0, false, 0, false, "gmsVersion", 19, null));
        bsjVar.put("optionFlagsSetIndicator", new FastJsonResponse$Field(2, false, 2, false, "optionFlagsSetIndicator", 20, null));
        bsjVar.put("PostTransferAction", new FastJsonResponse$Field(11, false, 11, false, "PostTransferAction", 21, PostTransferAction.class));
        bsjVar.put("SharedSecret", new FastJsonResponse$Field(8, false, 8, false, "SharedSecret", 22, null));
        bsjVar.put("esimActivationInfo", new FastJsonResponse$Field(11, false, 11, false, "esimActivationInfo", 23, EsimActivationInfo.class));
        bsjVar.put("advertisementOptions", new FastJsonResponse$Field(11, false, 11, false, "advertisementOptions", 24, AdvertisementOptions.class));
        bsjVar.put("moduleVersion", new FastJsonResponse$Field(0, false, 0, false, "moduleVersion", 25, null));
        bsjVar.put("nearbyDirectTransfer", new FastJsonResponse$Field(6, false, 6, false, "nearbyDirectTransfer", 26, null));
        bsjVar.put("deeplinkPairingCode", new FastJsonResponse$Field(7, false, 7, false, "deeplinkPairingCode", 27, null));
        bsjVar.put("targetSuwStatus", new FastJsonResponse$Field(0, false, 0, false, "targetSuwStatus", 28, null));
        bsjVar.put("accountsOnTarget", new FastJsonResponse$Field(11, true, 11, true, "accountsOnTarget", 29, BootstrapAccount.class));
        bsjVar.put("targetDeviceFingerprint", new FastJsonResponse$Field(7, false, 7, false, "targetDeviceFingerprint", 30, null));
        E = DesugarCollections.unmodifiableMap(bsjVar);
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

    @Override // defpackage.aulm
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
            case fywe.q /* 17 */:
                return Integer.valueOf(this.q);
            case 18:
                return Long.valueOf(this.r);
            case 19:
                return Integer.valueOf(this.s);
            case fywe.t /* 20 */:
                return Long.valueOf(this.t);
            case fywe.u /* 21 */:
                return this.u;
            case fywe.v /* 22 */:
                return this.v;
            case fywe.w /* 23 */:
                return this.w;
            case fywe.x /* 24 */:
                return this.x;
            case fywe.y /* 25 */:
                return Integer.valueOf(this.y);
            case 26:
                return Boolean.valueOf(this.z);
            case fywe.A /* 27 */:
                return this.A;
            case fywe.B /* 28 */:
                return Byte.valueOf(this.B);
            case fywe.C /* 29 */:
                return this.C;
            case fywe.D /* 30 */:
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

    @Override // defpackage.aulm
    public final Map b() {
        return E;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
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

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 29) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.C = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
            this.h = (CompanionApp) aulmVar;
        } else if (i == 21) {
            this.u = (PostTransferAction) aulmVar;
        } else if (i == 23) {
            this.w = (EsimActivationInfo) aulmVar;
        } else {
            if (i != 24) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), aulmVar.getClass().getCanonicalName()));
            }
            this.x = (AdvertisementOptions) aulmVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
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

    @Override // defpackage.aulm
    protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 5) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
        }
        this.e = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 22) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
        }
        this.v = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
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

    @Override // defpackage.aulm
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

    public final dfjg p() {
        return new dfjg(this.r, this.t);
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
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.e(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            atzr.x(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.h(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            atzr.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            atzr.t(parcel, 8, this.h, i, true);
        }
        if (set.contains(9)) {
            atzr.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            atzr.o(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            atzr.o(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            atzr.q(parcel, 12, this.l);
        }
        if (set.contains(13)) {
            atzr.e(parcel, 13, this.m);
        }
        if (set.contains(14)) {
            atzr.e(parcel, 14, this.n);
        }
        if (set.contains(15)) {
            atzr.e(parcel, 15, this.o);
        }
        if (set.contains(16)) {
            atzr.e(parcel, 16, this.p);
        }
        if (set.contains(17)) {
            atzr.o(parcel, 17, this.q);
        }
        if (set.contains(18)) {
            atzr.q(parcel, 18, this.r);
        }
        if (set.contains(19)) {
            atzr.o(parcel, 19, this.s);
        }
        if (set.contains(20)) {
            atzr.q(parcel, 20, this.t);
        }
        if (set.contains(21)) {
            atzr.t(parcel, 21, this.u, i, true);
        }
        if (set.contains(22)) {
            atzr.i(parcel, 22, this.v, true);
        }
        if (set.contains(23)) {
            atzr.t(parcel, 23, this.w, i, true);
        }
        if (set.contains(24)) {
            atzr.t(parcel, 24, this.x, i, true);
        }
        if (set.contains(25)) {
            atzr.o(parcel, 25, this.y);
        }
        if (set.contains(26)) {
            atzr.e(parcel, 26, this.z);
        }
        if (set.contains(27)) {
            atzr.v(parcel, 27, this.A, true);
        }
        if (set.contains(28)) {
            atzr.h(parcel, 28, this.B);
        }
        if (set.contains(29)) {
            atzr.y(parcel, 29, this.C, true);
        }
        if (set.contains(30)) {
            atzr.v(parcel, 30, this.D, true);
        }
        atzr.c(parcel, a);
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
