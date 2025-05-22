package com.google.android.gms.findmydevice.spot.fastpair.halfsheet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bgbe;
import defpackage.dpsf;
import defpackage.ekvk;
import defpackage.ekvl;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ProvisionParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bgbe();
    public final byte[] a;
    public final Account b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public ProvisionParams(byte[] bArr, Account account, String str, String str2, String str3) {
        this(bArr, account, str, str2, str3, 0);
    }

    public final dpsf a() {
        return dpsf.a(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int b() {
        char c;
        String str = this.d;
        switch (str.hashCode()) {
            case -1629272979:
                if (str.equals("RETROACTIVE_PAIRING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1104458162:
                if (str.equals("UPGRADE_NOTIFICATION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -923452419:
                if (str.equals("ACCESSORY_TRACKED_BY_OWNER_NOTIFICATION")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -118987704:
                if (str.equals("RETROACTIVE_PROVISIONING")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 43106445:
                if (str.equals("INITIAL_PAIRING")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 526786327:
                if (str.equals("UNSPECIFIED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        if (c == 5) {
            return 6;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ProvisionParams) {
            ProvisionParams provisionParams = (ProvisionParams) obj;
            if (Arrays.equals(this.a, provisionParams.a) && this.b.equals(provisionParams.b) && this.c.equals(provisionParams.c) && this.d.equals(provisionParams.d) && this.e.equals(provisionParams.e) && this.f == provisionParams.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public ProvisionParams(byte[] bArr, Account account, String str, String str2, String str3, int i) {
        ekvl.y(bArr);
        this.a = bArr;
        ekvl.y(account);
        this.b = account;
        this.c = ekvk.b(str);
        this.d = str2;
        this.e = str3;
        this.f = i;
    }
}
