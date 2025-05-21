package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.fragments.ND4COptionsContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import defpackage.asnz;
import defpackage.asot;
import defpackage.bivk;
import defpackage.bivr;
import defpackage.bivs;
import defpackage.bjaw;
import defpackage.bjbk;
import defpackage.bjda;
import defpackage.bjdb;
import defpackage.bjdc;
import defpackage.fecj;
import defpackage.fhfd;
import defpackage.fhfx;
import defpackage.fhgb;
import defpackage.fhgc;
import defpackage.fhgd;
import defpackage.fhge;
import defpackage.foof;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ND4COptionsContainer extends LinearLayout {
    public ND4COptionsContainer(Context context) {
        this(context, null);
    }

    public static boolean b(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final void a(final HelpChimeraActivity helpChimeraActivity) {
        final String str;
        final String str2;
        String str3;
        char c;
        char c2;
        boolean z;
        String str4;
        asot asotVar = bjaw.a;
        if (bivk.b(foof.d())) {
            fecj v = bjda.a.v();
            if (!v.b.L()) {
                v.U();
            }
            bjda bjdaVar = (bjda) v.b;
            bjdaVar.c = 25;
            bjdaVar.b |= 1;
            bjda bjdaVar2 = (bjda) v.Q();
            HelpConfig hM = helpChimeraActivity.hM();
            fecj v2 = bjdb.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            bjdb bjdbVar = (bjdb) v2.b;
            bjdaVar2.getClass();
            bjdbVar.d = bjdaVar2;
            bjdbVar.c = 3;
            bjaw.J(helpChimeraActivity, hM, v2);
        }
        asot asotVar2 = bjbk.a;
        fecj v3 = bjdc.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        bjdc bjdcVar = (bjdc) v3.b;
        bjdcVar.i = 201;
        bjdcVar.b |= 256;
        bjbk.E(helpChimeraActivity, v3, asnz.a);
        HelpConfig helpConfig = helpChimeraActivity.W;
        fhfx fhfxVar = helpConfig.j;
        String str5 = "";
        if (fhfxVar == null) {
            str = "";
        } else {
            fhgd fhgdVar = fhfxVar.f;
            if (fhgdVar == null) {
                fhgdVar = fhgd.a;
            }
            fhgc fhgcVar = fhgdVar.c;
            if (fhgcVar == null) {
                fhgcVar = fhgc.a;
            }
            str = fhgcVar.b;
        }
        fhfx fhfxVar2 = helpConfig.j;
        if (fhfxVar2 == null) {
            str2 = "";
        } else {
            fhgd fhgdVar2 = fhfxVar2.f;
            if (fhgdVar2 == null) {
                fhgdVar2 = fhgd.a;
            }
            fhge fhgeVar = fhgdVar2.d;
            if (fhgeVar == null) {
                fhgeVar = fhge.a;
            }
            str2 = fhgeVar.b;
        }
        if (!helpConfig.D() && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            ((TextView) findViewById(R.id.gh_retry_message)).setVisibility(0);
            return;
        }
        if (helpConfig.D()) {
            fhfx fhfxVar3 = helpConfig.j;
            if (fhfxVar3 == null) {
                z = false;
            } else {
                fhgd fhgdVar3 = fhfxVar3.f;
                if (fhgdVar3 == null) {
                    fhgdVar3 = fhgd.a;
                }
                fhgb fhgbVar = fhgdVar3.e;
                if (fhgbVar == null) {
                    fhgbVar = fhgb.a;
                }
                z = fhgbVar.b;
            }
            fhfx fhfxVar4 = helpConfig.j;
            if (fhfxVar4 == null) {
                str4 = "";
            } else {
                fhgd fhgdVar4 = fhfxVar4.f;
                if (fhgdVar4 == null) {
                    fhgdVar4 = fhgd.a;
                }
                fhgb fhgbVar2 = fhgdVar4.e;
                if (fhgbVar2 == null) {
                    fhgbVar2 = fhgb.a;
                }
                str4 = fhgbVar2.c;
            }
            fhfd f = helpConfig.f();
            fhfd fhfdVar = fhfd.ND4C_CHAT;
            boolean z2 = f == fhfdVar;
            bjaw.G(helpChimeraActivity, 27, 9);
            bjbk.q(helpChimeraActivity, 46, fhfdVar, -1);
            View findViewById = findViewById(R.id.gh_chat_card);
            findViewById.setVisibility(0);
            if (z) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: biwv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                        bjaw.G(helpChimeraActivity2, 28, 9);
                        bjbk.q(helpChimeraActivity2, 47, fhfd.ND4C_CHAT, -1);
                        HelpConfig helpConfig2 = helpChimeraActivity2.W;
                        helpConfig2.al = fone.c();
                        helpConfig2.am = 1;
                        birf.a(helpChimeraActivity2);
                    }
                });
            } else {
                findViewById.setClickable(false);
                findViewById.setBackground(null);
            }
            TextView textView = (TextView) findViewById(R.id.gh_chat_recommended_label);
            if (z && z2) {
                textView.setVisibility(0);
            }
            ((TextView) findViewById(R.id.gh_chat_subtext_snippet)).setText(str4);
            ImageView imageView = (ImageView) findViewById(R.id.gh_chat_icon);
            Drawable drawable = helpChimeraActivity.getDrawable(2131232942);
            if (drawable != null) {
                imageView.setImageDrawable(bivr.b(drawable, helpChimeraActivity, bivs.a(helpChimeraActivity, !z ? R.attr.ghf_greyIconColor : z2 ? R.attr.gh_recommendedContactOptionColor : R.attr.gh_primaryBlueColor)));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            fhfx fhfxVar5 = helpConfig.j;
            if (fhfxVar5 == null) {
                str3 = "";
            } else {
                fhgd fhgdVar5 = fhfxVar5.f;
                if (fhgdVar5 == null) {
                    fhgdVar5 = fhgd.a;
                }
                fhge fhgeVar2 = fhgdVar5.d;
                if (fhgeVar2 == null) {
                    fhgeVar2 = fhge.a;
                }
                str3 = fhgeVar2.c;
            }
            fhfd f2 = helpConfig.f();
            fhfd fhfdVar2 = fhfd.ND4C_PHONE;
            if (f2 == fhfdVar2) {
                c2 = 1;
                c = 1;
            } else {
                c = 1;
                c2 = 0;
            }
            bjaw.G(helpChimeraActivity, 27, 7);
            bjbk.q(helpChimeraActivity, 46, fhfdVar2, -1);
            View findViewById2 = findViewById(R.id.gh_phone_card);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: biwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:".concat(String.valueOf(str2))));
                    HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                    if (ND4COptionsContainer.b(helpChimeraActivity2, intent)) {
                        bjaw.G(helpChimeraActivity2, 28, 7);
                        bjbk.q(helpChimeraActivity2, 47, fhfd.ND4C_PHONE, -1);
                        helpChimeraActivity2.startActivity(intent);
                    }
                }
            });
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            objArr[c] = str3;
            findViewById2.setContentDescription(helpChimeraActivity.getString(R.string.gh_nd4c_contact_option_content_description, objArr));
            TextView textView2 = (TextView) findViewById(R.id.gh_phone_heading);
            TextView textView3 = (TextView) findViewById(R.id.gh_phone_recommended_label);
            TextView textView4 = (TextView) findViewById(R.id.gh_phone_subtext_snippet);
            textView2.setText(str2);
            if (c2 != 0) {
                textView3.setVisibility(0);
            }
            textView4.setText(str3);
            ImageView imageView2 = (ImageView) findViewById(R.id.gh_phone_icon);
            Drawable drawable2 = helpChimeraActivity.getDrawable(2131233092);
            if (drawable2 != null) {
                imageView2.setImageDrawable(bivr.b(drawable2, helpChimeraActivity, bivs.a(helpChimeraActivity, c != c2 ? R.attr.gh_primaryBlueColor : R.attr.gh_recommendedContactOptionColor)));
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fhfx fhfxVar6 = helpConfig.j;
        if (fhfxVar6 != null) {
            fhgd fhgdVar6 = fhfxVar6.f;
            if (fhgdVar6 == null) {
                fhgdVar6 = fhgd.a;
            }
            fhgc fhgcVar2 = fhgdVar6.c;
            if (fhgcVar2 == null) {
                fhgcVar2 = fhgc.a;
            }
            str5 = fhgcVar2.c;
        }
        fhfd f3 = helpConfig.f();
        fhfd fhfdVar3 = fhfd.ND4C_EMAIL;
        boolean z3 = f3 == fhfdVar3;
        bjaw.G(helpChimeraActivity, 27, 8);
        bjbk.q(helpChimeraActivity, 46, fhfdVar3, -1);
        View findViewById3 = findViewById(R.id.gh_email_card);
        findViewById3.setVisibility(0);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: biwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                if (ND4COptionsContainer.b(helpChimeraActivity2, intent)) {
                    bjaw.G(helpChimeraActivity2, 28, 8);
                    bjbk.q(helpChimeraActivity2, 47, fhfd.ND4C_EMAIL, -1);
                    helpChimeraActivity2.startActivity(intent);
                }
            }
        });
        findViewById3.setContentDescription(helpChimeraActivity.getString(R.string.gh_nd4c_contact_option_content_description, new Object[]{str, str5}));
        TextView textView5 = (TextView) findViewById(R.id.gh_email_heading);
        TextView textView6 = (TextView) findViewById(R.id.gh_email_recommended_label);
        TextView textView7 = (TextView) findViewById(R.id.gh_email_subtext_snippet);
        textView5.setText(str);
        if (z3) {
            textView6.setVisibility(0);
        }
        textView7.setText(str5);
        ImageView imageView3 = (ImageView) findViewById(R.id.gh_email_icon);
        Drawable drawable3 = helpChimeraActivity.getDrawable(2131233056);
        if (drawable3 != null) {
            imageView3.setImageDrawable(bivr.b(drawable3, helpChimeraActivity, bivs.a(helpChimeraActivity, true != z3 ? R.attr.gh_primaryBlueColor : R.attr.gh_recommendedContactOptionColor)));
        }
    }

    public ND4COptionsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_nd4c_options_content_gm3, (ViewGroup) this, true);
    }
}
