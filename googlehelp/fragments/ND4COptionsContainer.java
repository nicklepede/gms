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
import defpackage.aurt;
import defpackage.ausn;
import defpackage.bkzz;
import defpackage.blag;
import defpackage.blah;
import defpackage.blfl;
import defpackage.blfz;
import defpackage.blhp;
import defpackage.blhq;
import defpackage.blhr;
import defpackage.fgrc;
import defpackage.fjva;
import defpackage.fjvu;
import defpackage.fjvy;
import defpackage.fjvz;
import defpackage.fjwa;
import defpackage.fjwb;
import defpackage.frgy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        ausn ausnVar = blfl.a;
        if (bkzz.b(frgy.d())) {
            fgrc v = blhp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            blhp blhpVar = (blhp) v.b;
            blhpVar.c = 25;
            blhpVar.b |= 1;
            blhp blhpVar2 = (blhp) v.Q();
            HelpConfig ic = helpChimeraActivity.ic();
            fgrc v2 = blhq.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            blhq blhqVar = (blhq) v2.b;
            blhpVar2.getClass();
            blhqVar.d = blhpVar2;
            blhqVar.c = 3;
            blfl.J(helpChimeraActivity, ic, v2);
        }
        ausn ausnVar2 = blfz.a;
        fgrc v3 = blhr.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        blhr blhrVar = (blhr) v3.b;
        blhrVar.i = 201;
        blhrVar.b |= 256;
        blfz.E(helpChimeraActivity, v3, aurt.a);
        HelpConfig helpConfig = helpChimeraActivity.W;
        fjvu fjvuVar = helpConfig.j;
        String str5 = "";
        if (fjvuVar == null) {
            str = "";
        } else {
            fjwa fjwaVar = fjvuVar.f;
            if (fjwaVar == null) {
                fjwaVar = fjwa.a;
            }
            fjvz fjvzVar = fjwaVar.c;
            if (fjvzVar == null) {
                fjvzVar = fjvz.a;
            }
            str = fjvzVar.b;
        }
        fjvu fjvuVar2 = helpConfig.j;
        if (fjvuVar2 == null) {
            str2 = "";
        } else {
            fjwa fjwaVar2 = fjvuVar2.f;
            if (fjwaVar2 == null) {
                fjwaVar2 = fjwa.a;
            }
            fjwb fjwbVar = fjwaVar2.d;
            if (fjwbVar == null) {
                fjwbVar = fjwb.a;
            }
            str2 = fjwbVar.b;
        }
        if (!helpConfig.D() && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            ((TextView) findViewById(R.id.gh_retry_message)).setVisibility(0);
            return;
        }
        if (helpConfig.D()) {
            fjvu fjvuVar3 = helpConfig.j;
            if (fjvuVar3 == null) {
                z = false;
            } else {
                fjwa fjwaVar3 = fjvuVar3.f;
                if (fjwaVar3 == null) {
                    fjwaVar3 = fjwa.a;
                }
                fjvy fjvyVar = fjwaVar3.e;
                if (fjvyVar == null) {
                    fjvyVar = fjvy.a;
                }
                z = fjvyVar.b;
            }
            fjvu fjvuVar4 = helpConfig.j;
            if (fjvuVar4 == null) {
                str4 = "";
            } else {
                fjwa fjwaVar4 = fjvuVar4.f;
                if (fjwaVar4 == null) {
                    fjwaVar4 = fjwa.a;
                }
                fjvy fjvyVar2 = fjwaVar4.e;
                if (fjvyVar2 == null) {
                    fjvyVar2 = fjvy.a;
                }
                str4 = fjvyVar2.c;
            }
            fjva f = helpConfig.f();
            fjva fjvaVar = fjva.ND4C_CHAT;
            boolean z2 = f == fjvaVar;
            blfl.G(helpChimeraActivity, 27, 9);
            blfz.q(helpChimeraActivity, 46, fjvaVar, -1);
            View findViewById = findViewById(R.id.gh_chat_card);
            findViewById.setVisibility(0);
            if (z) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: blbk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                        blfl.G(helpChimeraActivity2, 28, 9);
                        blfz.q(helpChimeraActivity2, 47, fjva.ND4C_CHAT, -1);
                        HelpConfig helpConfig2 = helpChimeraActivity2.W;
                        helpConfig2.al = frfx.c();
                        helpConfig2.am = 1;
                        bkvu.a(helpChimeraActivity2);
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
            Drawable drawable = helpChimeraActivity.getDrawable(2131233006);
            if (drawable != null) {
                imageView.setImageDrawable(blag.b(drawable, helpChimeraActivity, blah.a(helpChimeraActivity, !z ? R.attr.ghf_greyIconColor : z2 ? R.attr.gh_recommendedContactOptionColor : R.attr.gh_primaryBlueColor)));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            fjvu fjvuVar5 = helpConfig.j;
            if (fjvuVar5 == null) {
                str3 = "";
            } else {
                fjwa fjwaVar5 = fjvuVar5.f;
                if (fjwaVar5 == null) {
                    fjwaVar5 = fjwa.a;
                }
                fjwb fjwbVar2 = fjwaVar5.d;
                if (fjwbVar2 == null) {
                    fjwbVar2 = fjwb.a;
                }
                str3 = fjwbVar2.c;
            }
            fjva f2 = helpConfig.f();
            fjva fjvaVar2 = fjva.ND4C_PHONE;
            if (f2 == fjvaVar2) {
                c2 = 1;
                c = 1;
            } else {
                c = 1;
                c2 = 0;
            }
            blfl.G(helpChimeraActivity, 27, 7);
            blfz.q(helpChimeraActivity, 46, fjvaVar2, -1);
            View findViewById2 = findViewById(R.id.gh_phone_card);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: blbj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:".concat(String.valueOf(str2))));
                    HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                    if (ND4COptionsContainer.b(helpChimeraActivity2, intent)) {
                        blfl.G(helpChimeraActivity2, 28, 7);
                        blfz.q(helpChimeraActivity2, 47, fjva.ND4C_PHONE, -1);
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
            Drawable drawable2 = helpChimeraActivity.getDrawable(2131233157);
            if (drawable2 != null) {
                imageView2.setImageDrawable(blag.b(drawable2, helpChimeraActivity, blah.a(helpChimeraActivity, c != c2 ? R.attr.gh_primaryBlueColor : R.attr.gh_recommendedContactOptionColor)));
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fjvu fjvuVar6 = helpConfig.j;
        if (fjvuVar6 != null) {
            fjwa fjwaVar6 = fjvuVar6.f;
            if (fjwaVar6 == null) {
                fjwaVar6 = fjwa.a;
            }
            fjvz fjvzVar2 = fjwaVar6.c;
            if (fjvzVar2 == null) {
                fjvzVar2 = fjvz.a;
            }
            str5 = fjvzVar2.c;
        }
        fjva f3 = helpConfig.f();
        fjva fjvaVar3 = fjva.ND4C_EMAIL;
        boolean z3 = f3 == fjvaVar3;
        blfl.G(helpChimeraActivity, 27, 8);
        blfz.q(helpChimeraActivity, 46, fjvaVar3, -1);
        View findViewById3 = findViewById(R.id.gh_email_card);
        findViewById3.setVisibility(0);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: blbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                HelpChimeraActivity helpChimeraActivity2 = HelpChimeraActivity.this;
                if (ND4COptionsContainer.b(helpChimeraActivity2, intent)) {
                    blfl.G(helpChimeraActivity2, 28, 8);
                    blfz.q(helpChimeraActivity2, 47, fjva.ND4C_EMAIL, -1);
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
        Drawable drawable3 = helpChimeraActivity.getDrawable(2131233121);
        if (drawable3 != null) {
            imageView3.setImageDrawable(blag.b(drawable3, helpChimeraActivity, blah.a(helpChimeraActivity, true != z3 ? R.attr.gh_primaryBlueColor : R.attr.gh_recommendedContactOptionColor)));
        }
    }

    public ND4COptionsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_nd4c_options_content_gm3, (ViewGroup) this, true);
    }
}
