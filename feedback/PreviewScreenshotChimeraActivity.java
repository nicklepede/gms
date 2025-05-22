package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import com.google.android.gms.R;
import defpackage.bcsh;
import defpackage.fqhm;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PreviewScreenshotChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (fqhm.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        setContentView(R.layout.preview_ui);
        ImageView imageView = (ImageView) findViewById(R.id.gf_screenshot_view);
        Bitmap a = bcsh.a();
        if (a == null) {
            finish();
            return;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int[] iArr = {point.x, point.y};
        float width = a.getWidth();
        float height = a.getHeight();
        int i2 = (int) (width * 1.5f);
        if (i2 < iArr[0] && (i = (int) (height * 1.5f)) < iArr[1]) {
            a = Bitmap.createScaledBitmap(a, i2, i, true);
        }
        imageView.setImageBitmap(a);
    }
}
