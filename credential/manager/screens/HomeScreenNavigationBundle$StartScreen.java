package com.google.android.gms.credential.manager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.credential.manager.screens.HomeScreenNavigationBundle$StartScreen;
import defpackage.fuzq;
import defpackage.fvbo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class HomeScreenNavigationBundle$StartScreen implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final HomeScreenNavigationBundle$StartScreen a;
    public static final HomeScreenNavigationBundle$StartScreen b;
    public static final HomeScreenNavigationBundle$StartScreen c;
    private static final /* synthetic */ HomeScreenNavigationBundle$StartScreen[] d;

    static {
        HomeScreenNavigationBundle$StartScreen homeScreenNavigationBundle$StartScreen = new HomeScreenNavigationBundle$StartScreen("Passwords", 0);
        a = homeScreenNavigationBundle$StartScreen;
        HomeScreenNavigationBundle$StartScreen homeScreenNavigationBundle$StartScreen2 = new HomeScreenNavigationBundle$StartScreen("Checkup", 1);
        b = homeScreenNavigationBundle$StartScreen2;
        HomeScreenNavigationBundle$StartScreen homeScreenNavigationBundle$StartScreen3 = new HomeScreenNavigationBundle$StartScreen("Settings", 2);
        c = homeScreenNavigationBundle$StartScreen3;
        HomeScreenNavigationBundle$StartScreen[] homeScreenNavigationBundle$StartScreenArr = {homeScreenNavigationBundle$StartScreen, homeScreenNavigationBundle$StartScreen2, homeScreenNavigationBundle$StartScreen3};
        d = homeScreenNavigationBundle$StartScreenArr;
        fuzq.a(homeScreenNavigationBundle$StartScreenArr);
        CREATOR = new Parcelable.Creator() { // from class: awln
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                fvbo.f(parcel, "parcel");
                String readString = parcel.readString();
                Parcelable.Creator creator = HomeScreenNavigationBundle$StartScreen.CREATOR;
                return (HomeScreenNavigationBundle$StartScreen) Enum.valueOf(HomeScreenNavigationBundle$StartScreen.class, readString);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new HomeScreenNavigationBundle$StartScreen[i];
            }
        };
    }

    private HomeScreenNavigationBundle$StartScreen(String str, int i) {
    }

    public static HomeScreenNavigationBundle$StartScreen[] values() {
        return (HomeScreenNavigationBundle$StartScreen[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        parcel.writeString(name());
    }
}
