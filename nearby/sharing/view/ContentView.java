package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import defpackage.chkv;
import defpackage.cohk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContentView extends FrameLayout {
    public ContentView(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        chkv.f();
        LayoutInflater.from(context).inflate(R.layout.sharing_view_content_preview, this);
        if (attributeSet == null || b(context, attributeSet) == 1 || b(context, attributeSet) != 2) {
            return;
        }
        findViewById(R.id.content_preview_root).setPadding((int) getResources().getDimension(R.dimen.sharing_share_sheet_content_preview_padding_start), (int) getResources().getDimension(R.dimen.sharing_share_sheet_content_preview_padding_top_bottom), (int) getResources().getDimension(R.dimen.sharing_share_sheet_content_preview_padding_end), (int) getResources().getDimension(R.dimen.sharing_share_sheet_content_preview_padding_top_bottom));
        findViewById(R.id.content_container).setPadding(0, 0, 0, 0);
        findViewById(R.id.preview).setMinimumHeight((int) getResources().getDimension(R.dimen.sharing_share_sheet_preview_min_height));
    }

    private static final int b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cohk.e);
        if (!obtainStyledAttributes.hasValue(0)) {
            return 1;
        }
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return i == 1 ? 2 : 1;
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
