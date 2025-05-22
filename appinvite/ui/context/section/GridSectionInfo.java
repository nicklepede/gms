package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.vui;
import defpackage.vuu;
import defpackage.vvb;
import defpackage.vvu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GridSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new vvu();

    public GridSectionInfo(Parcel parcel) {
        super(parcel);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final vuu a(vui vuiVar, int i) {
        vvb vvbVar = new vvb(vuiVar, R.layout.appinvite_contextual_selection_grid_item, i, false, this.i, false);
        vvbVar.U(this.g, this.h);
        return vvbVar;
    }

    public GridSectionInfo(String str) {
        super(str);
    }
}
