package com.google.android.gms.people.profile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aspm;
import defpackage.aspn;
import defpackage.cuey;
import defpackage.cufy;
import defpackage.frft;
import defpackage.frhu;
import defpackage.qfp;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AvatarPreviewChimeraActivity extends qfp implements View.OnClickListener {
    private Uri j;
    private AvatarView k;

    private final void a() {
        Toast.makeText(this, R.string.people_avatar_error, 0).show();
        setResult(1);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OutputStream outputStream;
        int id = view.getId();
        if (id == R.id.cancel_button) {
            setResult(0);
            finish();
            return;
        }
        if (id == R.id.accept_button) {
            Uri a = cufy.a(this, "cropped-avatar.jpg");
            if (a == null) {
                cuey.l("People.Avatar", "Failed to get temp file to crop photo");
                a();
                return;
            }
            try {
                AvatarView avatarView = this.k;
                Rect rect = avatarView.d;
                float f = 256.0f / (rect.right - rect.left);
                int i = -rect.left;
                int i2 = -rect.top;
                Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(avatarView.getResources().getColor(R.color.people_avatar_preview_background));
                Matrix matrix = new Matrix(avatarView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate(i, i2);
                }
                if (f + f != 0.0f) {
                    matrix.postScale(f, f);
                }
                canvas.concat(matrix);
                avatarView.a.draw(canvas);
                try {
                    outputStream = avatarView.getContext().getContentResolver().openOutputStream(a);
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
                try {
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, (int) frhu.b(), outputStream);
                    aspm.b(outputStream);
                    Intent intent = new Intent();
                    intent.putExtra("com.google.android.gms.people.profile.EXTRA_URI", a);
                    setResult(-1, intent);
                    finish();
                } catch (Throwable th2) {
                    th = th2;
                    aspm.b(outputStream);
                    throw th;
                }
            } catch (Exception e) {
                cuey.d("People.Avatar", "Failed to write cropped photo", e);
                a();
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = (Uri) getIntent().getExtras().getParcelable("com.google.android.gms.people.profile.EXTRA_URI");
        } else {
            this.j = (Uri) bundle.getParcelable("photo_uri");
        }
        setContentView(R.layout.avatar_preview_activity);
        AvatarView avatarView = (AvatarView) findViewById(R.id.avatar_view);
        this.k = avatarView;
        try {
            Uri uri = this.j;
            avatarView.a();
            int c = (int) frhu.c();
            Bitmap b = aspn.b(avatarView.getContext(), uri, c, c, frft.a.a().a());
            if (b == null) {
                throw new IllegalStateException("No bitmap loaded from ".concat(String.valueOf(String.valueOf(uri))));
            }
            Drawable drawable = avatarView.a;
            if (drawable != null) {
                drawable.setCallback(null);
                Drawable drawable2 = avatarView.a;
                if ((drawable2 instanceof BitmapDrawable) && b == ((BitmapDrawable) drawable2).getBitmap()) {
                    avatarView.requestLayout();
                    avatarView.invalidate();
                    this.k.i = true;
                    findViewById(R.id.cancel_button).setOnClickListener(this);
                    findViewById(R.id.accept_button).setOnClickListener(this);
                }
                if (avatarView.a.getIntrinsicWidth() == b.getWidth() && avatarView.a.getIntrinsicHeight() == b.getHeight()) {
                    z = false;
                    avatarView.m = 0.0f;
                    avatarView.a();
                }
                z = true;
                avatarView.m = 0.0f;
                avatarView.a();
            } else {
                z = false;
            }
            if (avatarView.a == null) {
                avatarView.a = new BitmapDrawable(avatarView.getResources(), b);
                avatarView.a.setCallback(avatarView);
            }
            avatarView.b(z);
            avatarView.invalidate();
            avatarView.requestLayout();
            avatarView.invalidate();
            this.k.i = true;
            findViewById(R.id.cancel_button).setOnClickListener(this);
            findViewById(R.id.accept_button).setOnClickListener(this);
        } catch (RuntimeException e) {
            cuey.n("People.Avatar", "Failed to initialize AvatarView: %s", e.getMessage());
            a();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("photo_uri", this.j);
    }
}
