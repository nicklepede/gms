package com.google.android.gms.trustagent.trustlet.device.ui;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import defpackage.atzr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.djcf;
import defpackage.djeb;
import defpackage.djec;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustedUiDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List b;
    public final String c;
    public final int d;
    public static final Parcelable.Creator CREATOR = new djeb();
    private static final ClassLoader e = TrustedUiDevice.class.getClassLoader();
    public static final ausn a = ausn.b("TrustAgent", auid.TRUSTAGENT);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DeviceReference extends AbstractSafeParcelable implements ReflectedParcelable {
        public static final Parcelable.Creator CREATOR = new djcf();
        public final String a;
        public final BluetoothDevice b;

        public DeviceReference(String str, BluetoothDevice bluetoothDevice) {
            this.a = str;
            this.b = bluetoothDevice;
        }

        public final Optional a() {
            return Optional.ofNullable(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceReference)) {
                return false;
            }
            DeviceReference deviceReference = (DeviceReference) obj;
            return Objects.equals(this.a, deviceReference.a) && Objects.equals(this.b, deviceReference.b);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.t(parcel, 2, this.b, i, false);
            atzr.c(parcel, a);
        }
    }

    public TrustedUiDevice(List list, String str, int i) {
        this.b = list;
        this.c = str;
        this.d = i;
    }

    public static Optional a(Bundle bundle, String str) {
        if (bundle == null) {
            return Optional.empty();
        }
        ClassLoader classLoader = e;
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        return Optional.ofNullable((TrustedUiDevice) bundle.getParcelable(str));
    }

    public final String b() {
        return djec.d(((DeviceReference) Objects.requireNonNull((DeviceReference) this.b.get(0))).a);
    }

    public final boolean c() {
        return Collection.EL.stream(this.b).allMatch(new Predicate() { // from class: djdw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo478negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Parcelable.Creator creator = TrustedUiDevice.CREATOR;
                return ((Boolean) ((TrustedUiDevice.DeviceReference) obj).a().map(new Function() { // from class: djea
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo479andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i = djec.a;
                        return Boolean.valueOf(((BluetoothDevice) obj2).isConnected());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue();
            }
        });
    }

    public final boolean d() {
        return Collection.EL.stream(this.b).allMatch(new Predicate() { // from class: djdz
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo478negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Parcelable.Creator creator = TrustedUiDevice.CREATOR;
                return ((Boolean) ((TrustedUiDevice.DeviceReference) obj).a().map(new Function() { // from class: djdv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo479andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(djec.i((BluetoothDevice) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue();
            }
        });
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.o(parcel, 3, this.d);
        atzr.c(parcel, a2);
    }
}
